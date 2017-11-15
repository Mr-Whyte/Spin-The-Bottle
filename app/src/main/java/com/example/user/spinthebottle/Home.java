package com.example.user.spinthebottle;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import com.example.user.spinthebottle.Main.Ask_Truth_Dare;

import java.util.Random;

/**
 * Created by user on 10/15/2017.
 */

public class Home extends AppCompatActivity {

    ImageView bottle;

    Random r;

    int angle;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        r = new Random();

        bottle = (ImageView) findViewById(R.id.bottle);

        bottle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                angle = (r.nextInt() + 360);
                RotateAnimation rotate = new RotateAnimation(0, angle,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setFillAfter(true);
                rotate.setDuration(1000);
                rotate.setInterpolator(new AccelerateDecelerateInterpolator());

                bottle.startAnimation(rotate);
            }


        });

        new CountDownTimer(5000,1000) {
            public void onFinish() {
                Intent startActivity = new Intent(Home.this,Ask_Truth_Dare.class);
                startActivity(startActivity);
                finish();
            }

            public void onTick(long millisUntilFinished) {
            }

        }.start();

    }
}
