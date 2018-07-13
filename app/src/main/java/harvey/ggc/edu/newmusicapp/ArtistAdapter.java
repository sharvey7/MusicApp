package harvey.ggc.edu.newmusicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Artist> {

    public ArtistAdapter(Activity context, ArrayList<Artist> artists) {
        super(context, 0, artists);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }
        Artist currentArtist = getItem(position);
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_textView);

        songNameTextView.setText(currentArtist.getSongName());
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_textView);

        artistTextView.setText(currentArtist.getArtistName());

        return listItemView;

    }
}