package com.sophia.ggc.grizzlycolors;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
//import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    private int seekR, seekG, seekB, seekA;
    SeekBar redSeekBar, greenSeekBar, blueSeekBar, alphaSeekBar;
    LinearLayout rgbaScreen;


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        View layout = findViewById(R.id.activity_main);
        Drawable backgroundPic = layout.getBackground();
        backgroundPic.setAlpha(120);

        TextView textViewRGBA = (TextView) findViewById(R.id.textViewRGBA);
        textViewRGBA.setText("ARGBA ");

        rgbaScreen = (LinearLayout) findViewById(R.id.rgbaLinearLayout);
        redSeekBar = (SeekBar) findViewById(R.id.sbRed);
        greenSeekBar = (SeekBar) findViewById(R.id.sbGreen);
        blueSeekBar = (SeekBar) findViewById(R.id.sbAlpha);
        updateBackground();

        redSeekBar.setOnSeekBarChangeListener(seekBarChangeListener);
        greenSeekBar.setOnSeekBarChangeListener(seekBarChangeListener);
        blueSeekBar.setOnSeekBarChangeListener(seekBarChangeListener);
        alphaSeekBar.setOnSeekBarChangeListener(seekBarChangeListener);

        Button about = (Button) findViewById(R.id.btnAbout);
        about.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, About.class));  //reference to About class that is mentioned in layout
            }
        });
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

    }

    private void updateBackground() {
        seekR = redSeekBar.getProgress();
        seekG = greenSeekBar.getProgress();
        seekB = blueSeekBar.getProgress();
        seekA = alphaSeekBar.getProgress();
        rgbaScreen.setBackgroundColor(
                0xff000000
                        + seekA * 0x1000000
                        + seekR * 0x10000
                        + seekG * 0x100
                        + seekB
    }

    private SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        }

    };
};

