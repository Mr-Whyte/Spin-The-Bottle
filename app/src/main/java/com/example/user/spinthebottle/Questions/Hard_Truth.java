package com.example.user.spinthebottle.Questions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import com.example.user.spinthebottle.Home;
import com.example.user.spinthebottle.R;

import java.util.Random;

public class Hard_Truth extends AppCompatActivity {

    ImageView bottle;

    Button Return;

    Random r;

    int angle;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hard_truth);

        r = new Random();

        bottle = (ImageView) findViewById(R.id.bottle);

        Return = (Button) findViewById(R.id.Return);

        bottle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                angle = (r.nextInt()+360);
                RotateAnimation rotate = new RotateAnimation(0, angle,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setFillAfter(true);
                rotate.setDuration(1000);
                rotate.setInterpolator(new AccelerateDecelerateInterpolator());

                bottle.startAnimation(rotate);
            }




        });
        Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Hard_Truth.this,Home.class);
                startActivity(i);
            }
        });



    }
}

