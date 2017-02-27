package com.example.subash.ebbill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class empty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);

//        ProgressBar progress=(ProgressBar) findViewById(R.id.progressBar2);
//    public void download(View view){
//        progress=new ProgressDialog(this);
//        progress.setMessage("Downloading Music");
//        progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
//        progress.setIndeterminate(true);
//        progress.setProgress(0);
//        progress.show();
//
//        final int totalProgressTime = 100;
//        final Thread t = new Thread() {
//            @Override
//            public void run() {
//                int jumpTime = 0;
//
//                while(jumpTime < totalProgressTime) {
//                    try {
//                        sleep(200);
//                        jumpTime += 5;
//                        progress.setProgress(jumpTime);
//                    } catch (InterruptedException e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };
//        t.start();
//        public class empty extends Actio() {
//            Button b1;
//            private ProgressDialog progress;
//
//            protected void onCreate(Bundle savedInstanceState) {
//                super.onCreate(savedInstanceState);
//                setContentView(R.layout.activity_main);
//                b1 = (Button) findViewById(R.id.button2);
//            }
//
//            public void download(View view){
//                progress=new ProgressDialog(this);
//                progress.setMessage("Downloading Music");
//                progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
//                progress.setIndeterminate(true);
//                progress.setProgress(0);
//                progress.show();

        final int totalProgressTime = 100;
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar2);
        final Thread t = new Thread() {
            @Override
            public void run() {
                int jumpTime = 0;

                while (jumpTime < totalProgressTime) {
                    try {
                        sleep(2000);
                        jumpTime += 5;
                        progressBar.setProgress(jumpTime);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();


        Intent i=new Intent(empty.this,Main2Activity.class);
        startActivity(i);
    }

}
