package com.example.subash.ebbill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button2 = (Button) findViewById(R.id.button2);
        final TextView textView7=(TextView) findViewById(R.id.textView7);
        TextView textView8=(TextView) findViewById(R.id.textView8);
        TextView textView6=(TextView) findViewById(R.id.textView6);
        final EditText editText4=(EditText) findViewById(R.id.editText4);
        EditText editText5=(EditText) findViewById(R.id.editText5);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent i = new Intent(MainActivity.this, admin.class);
                startActivity(i);
            }
        });
    }
}
