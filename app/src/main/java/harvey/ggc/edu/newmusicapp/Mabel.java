package harvey.ggc.edu.newmusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Mabel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mabel);



        ArrayList<Artist> artists = new ArrayList<Artist>(); //contain word objects

        //this was the way below to add string such as 1
        // words.add("one");    //was <String> now <words> due to the custom class

        artists.add(new Artist("hey", "there"));



        /*words.add("two");
        words.add("ten"); */

        //returns a view
        //getView gives to listView
        // LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        //was ArrayAdapter now it's WordAdapter

        ArtistAdapter adapter = new ArtistAdapter(this, artists);
        //was simple_list_item_1 but was replaced with list-view, and android.
        // and words is replaced by
        //creating a custom class
        ListView listView =  findViewById(R.id.list);
        listView.setAdapter(adapter);




















    }
}
