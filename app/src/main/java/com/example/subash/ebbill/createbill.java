package com.example.subash.ebbill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class createbill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createbill);
        TextView textView11=(TextView) findViewById(R.id.textView11);
        EditText editText7=(EditText) findViewById(R.id.editText7);
        Button button11=(Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(createbill.this, createbill1.class);
                startActivity(i);
            }
        });
    }
}
