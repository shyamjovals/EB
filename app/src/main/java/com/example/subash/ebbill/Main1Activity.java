package com.example.subash.ebbill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        final EditText editText=(EditText) findViewById(R.id.editText);
        final EditText editText2=(EditText) findViewById(R.id.editText2);
        final EditText editText3=(EditText) findViewById(R.id.editText3);
        final TextView textView=(TextView) findViewById(R.id.textView);
        final TextView textView3=(TextView) findViewById(R.id.textView3);
        final TextView textView4=(TextView) findViewById(R.id.textView4);
        final TextView textView5=(TextView) findViewById(R.id.textView5);
        Button button=(Button) findViewById(R.id.button);
        Button button20=(Button) findViewById(R.id.button20);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Main1Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Main1Activity.this,newio .class);
                startActivity(i);
            }
        });
    }
}
