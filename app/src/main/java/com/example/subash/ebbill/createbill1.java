package com.example.subash.ebbill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class createbill1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createbill1);
        TextView textView11=(TextView) findViewById(R.id.textView11);
        EditText editText7=(EditText) findViewById(R.id.editText7);
        Button button=(Button) findViewById(R.id.button11);
        EditText name,add,ph,em,un;
        TextView textView13,textView14,textView15,textView16,textView17;
        name=(EditText) findViewById(R.id.editText11);
        add=(EditText) findViewById(R.id.editText12);
        ph=(EditText) findViewById(R.id.editText13);
        em=(EditText) findViewById(R.id.editText14);
        un=(EditText) findViewById(R.id.editText15);
        textView13=(TextView) findViewById(R.id.textView13);
        textView14=(TextView) findViewById(R.id.textView14);
        textView15=(TextView) findViewById(R.id.textView15);
        textView16=(TextView) findViewById(R.id.textView16);
        textView17=(TextView) findViewById(R.id.textView17);
        Button button13=(Button) findViewById(R.id.button13);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(createbill1.this, createbill1.class);
                startActivity(i);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(createbill1.this, amount.class);
                startActivity(i);
            }
        });
    }
}
