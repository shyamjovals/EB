package com.example.subash.ebbill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class userdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userdetails);
        Button button9=(Button) findViewById(R.id.button9);
        Button button10=(Button) findViewById(R.id.button10);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(userdetails.this, createbill.class);
                startActivity(i);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(userdetails.this, home.class);
                startActivity(i);
            }
        });
    }
}
