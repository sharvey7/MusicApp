package harvey.ggc.edu.newmusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mabel = (TextView) findViewById(R.id.mabel4);
        TextView stef = (TextView) findViewById(R.id.stef3);
        TextView ella = (TextView) findViewById(R.id.ella1);
        TextView raye = (TextView) findViewById(R.id.raye2);

        mabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mabelIntent = new Intent(MainActivity.this, Mabel.class);
                startActivity(mabelIntent);
            }
        });

        stef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stefIntent = new Intent(MainActivity.this, Stef.class);
                startActivity(stefIntent);
            }
        });

        raye.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent rayeIntent = new Intent(MainActivity.this, Raye.class);
                startActivity(rayeIntent);
            }
            });


        ella.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent ellaIntent = new Intent(MainActivity.this,Ella.class);
            startActivity(ellaIntent);
        }
    });
}
}

