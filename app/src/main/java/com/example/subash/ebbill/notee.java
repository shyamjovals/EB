package com.example.subash.ebbill;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.GregorianCalendar;

public class notee extends AppCompatActivity {

    Button send,stop,alarm;
    NotificationManager nm;
    boolean isNotificActive=false;
    int nid=33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notee);
        send=(Button) findViewById(R.id.button17);
        stop=(Button) findViewById(R.id.button18);
        alarm=(Button) findViewById(R.id.button19);
    }

    public void send(View view) {
        NotificationCompat.Builder notbuild=new NotificationCompat.Builder(this)
                .setContentTitle("Message")
                .setContentText("New message")
                .setTicker("Alert new message")
                .setSmallIcon(R.drawable.icon);
        Intent i=new Intent(this,maininfo.class);
        TaskStackBuilder tsb=TaskStackBuilder.create(this);
        tsb.addParentStack(maininfo.class);
        tsb.addNextIntent(i);
        PendingIntent pi=tsb.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
        notbuild.setContentIntent(pi);
        nm=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(nid,notbuild.build());
        isNotificActive=true;
    }


    public void stop(View view) {
        if (isNotificActive) {
            nm.cancel(nid);
        }
    }

    public void alarm(View view)
    {
        Long alertTime=new GregorianCalendar().getTimeInMillis()+5*1000;
        Intent i=new Intent(this,alert.class);
        AlarmManager am=(AlarmManager) getSystemService(Context.ALARM_SERVICE);
        am.set(AlarmManager.RTC_WAKEUP,alertTime,PendingIntent.getBroadcast(this,1,i,PendingIntent.FLAG_UPDATE_CURRENT));
    }
}
