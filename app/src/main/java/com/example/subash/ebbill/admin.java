package com.example.subash.ebbill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class admin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        Button button6,button7,button8;
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        ImageView imageView=(ImageView) findViewById(R.id.imageView);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(admin.this, userdetails.class);
                startActivity(i);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(admin.this, Main2Activity.class);
                startActivity(i);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(admin.this, home.class);
                startActivity(i);
            }
        });

    }
}
