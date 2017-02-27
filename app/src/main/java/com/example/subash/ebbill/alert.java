package com.example.subash.ebbill;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

public class alert extends BroadcastReceiver {

    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_alert);
//
    public void onReceive(Context con, Intent in)
    {
        createNotification(con,"Times up..","5 seconds are passed","alert");
    }

    private void createNotification(Context con, String s, String s1, String alert) {

        PendingIntent pi= PendingIntent.getActivity(con, 0,
                new Intent(con,notee.class),0);
        NotificationCompat.Builder nb=new NotificationCompat.Builder(con)
                .setSmallIcon(R.drawable.icon)
                .setContentTitle(s)
                .setTicker(alert)
                .setContentText(s1);
        nb.setContentIntent(pi);
        nb.setDefaults(NotificationCompat.DEFAULT_SOUND);
        nb.setAutoCancel(true);
        NotificationManager nm=(NotificationManager) con.getSystemService(con.NOTIFICATION_SERVICE);

        nm.notify(1,nb.build());


    }
}

