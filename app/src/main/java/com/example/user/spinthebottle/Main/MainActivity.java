package com.example.user.spinthebottle.Main;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.example.user.spinthebottle.Home;
import com.example.user.spinthebottle.R;

import java.util.Random;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    ImageView bottle;

    ProgressBar progress;

    Random r;

    int angle;

    private Timer t;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        bottle = (ImageView) findViewById(R.id.bottle);

        progress = (ProgressBar) findViewById(R.id.progressBar2);



        new CountDownTimer(5000, 1000) {
            public void onFinish() {
                Intent startActivity = new Intent(MainActivity.this,Home.class);
                startActivity(startActivity);
                finish();
            }

            public void onTick(long millisUntilFinished) {
            }

        }.start();


    }
}

