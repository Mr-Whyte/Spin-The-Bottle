package com.example.user.spinthebottle.Main;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.spinthebottle.Categories.Ask_Own_Question;
import com.example.user.spinthebottle.R;

public class Ask_Truth_Dare extends Activity {

    Button Ask,Truth,Dare;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ask_truth_dare);

        Ask = (Button) findViewById(R.id.Ask);
        Truth = (Button) findViewById(R.id.Truth);
        Dare = (Button) findViewById(R.id.Dare);



        Ask.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        Intent i = new Intent(Ask_Truth_Dare.this,Ask_Own_Question.class);
        Ask_Truth_Dare.this.startActivity(i);
        }
        });

        Truth.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        Intent p = new Intent(Ask_Truth_Dare.this, com.example.user.spinthebottle.Categories.Truth.class);
        Ask_Truth_Dare.this.startActivity(p);
        }
        });

        Dare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        Intent o = new Intent(Ask_Truth_Dare.this, com.example.user.spinthebottle.Categories.Dare.class);
        Ask_Truth_Dare.this.startActivity(o);
        }
        });


    }
}



