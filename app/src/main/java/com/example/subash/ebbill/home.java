package com.example.subash.ebbill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageButton imageButton=(ImageButton) findViewById(R.id.imageButton);
        ImageButton imageButton2=(ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(home.this, MainActivity.class);
                startActivity(i);
            }
        });
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(home.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
