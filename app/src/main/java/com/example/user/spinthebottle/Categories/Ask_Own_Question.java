package com.example.user.spinthebottle.Categories;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.spinthebottle.Home;
import com.example.user.spinthebottle.R;

public class Ask_Own_Question extends Activity {

    private Button Return;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ask_own_question);


        Return = (Button) findViewById(R.id.Return);

        Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Ask_Own_Question.this, Home.class);
                Ask_Own_Question.this.startActivity(i);


            }


        });

    }
}
