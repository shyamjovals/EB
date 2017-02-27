package com.example.subash.ebbill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final TextView textView9=(TextView) findViewById(R.id.textView9);
        final EditText editText6=(EditText) findViewById(R.id.editText6);
        final Button button3=(Button) findViewById(R.id.button3);
        ImageView imageView2=(ImageView) findViewById(R.id.imageView2);
        Button button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, home.class);
                startActivity(i);
            }
        });

    }
}
