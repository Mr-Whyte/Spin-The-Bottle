package com.example.user.spinthebottle.Categories;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.spinthebottle.R;


public class Dare extends Activity {

    Button Easy;

    Button Medium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dare);

        Easy = (Button) findViewById(R.id.easy);

        Medium = (Button) findViewById(R.id.medium);


        Easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        Intent w = new Intent(Dare.this, com.example.user.spinthebottle.Questions.Easy.class);
        startActivity(w);

            }
        });

        Medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r = new Intent(Dare.this, com.example.user.spinthebottle.Questions.Medium.class);
                startActivity(r);


            }
        });
    }

}
