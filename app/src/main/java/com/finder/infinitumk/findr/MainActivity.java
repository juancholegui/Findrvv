package com.finder.infinitumk.findr;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;

    private TextView text1;
    private Typeface bloo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String font = "fuentes/bloo.ttf";
        this.bloo = Typeface.createFromAsset(getAssets(), font);
        text1 = (TextView) findViewById(R.id.title1);
        text1.setTypeface(bloo);

        int post[] = {

                R.drawable.postb,
                R.drawable.postc,
                R.drawable.postd,
                R.drawable.poste,
                R.drawable.postg;
        viewFlipper = findViewById(R.id.slider);

        for (int i = 0; i < post.length; i++) {
            flipper(post[i]);

        }

}

        public void flipper ( int post){
            ImageView imageView = new ImageView(this);
            imageView.setBackgroundResource(post);
            viewFlipper.addView(imageView);
            viewFlipper.setFlipInterval(4000);
            viewFlipper.setAutoStart(true);


            viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
            viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);


        }


        public void maps (View v){
            Intent intent = new Intent(MainActivity.this, MapsActivity.class);
            startActivity(intent);
        }

        public void lookbr (View v){

            Intent intent = new Intent(MainActivity.this, bars.class);
            startActivity(intent);

        }
    }
}
