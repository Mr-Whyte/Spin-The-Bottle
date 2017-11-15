package com.example.user.spinthebottle.Categories;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.spinthebottle.R;


public class Truth extends Activity {

   Button Personal;

   Button Hard_Truth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.truth);

        Personal = (Button) findViewById(R.id.personal);

        Hard_Truth = (Button) findViewById(R.id.Hard_Truth);


        Personal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent f = new Intent(Truth.this, com.example.user.spinthebottle.Questions.Personal.class);
               startActivity(f);

               }
        });

        Hard_Truth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(Truth.this, com.example.user.spinthebottle.Questions.Hard_Truth.class);
                startActivity(t);


            }
        });

   }

}
