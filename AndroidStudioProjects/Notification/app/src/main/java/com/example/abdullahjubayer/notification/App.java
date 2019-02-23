package com.example.abdullahjubayer.notification;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;

public class App extends Application {
    public static final String Chanel_1="channel_1";
    public static final String Chanel_2="channel_2";

    //if api level more then 26 then used this method

//    @Override
//    public void onCreate() {
//        super.onCreate();
//
//        createNotificationChannel();
//    }
//
//    public void createNotificationChannel(){
//        NotificationChannel  channel=new NotificationChannel(Chanel_1,"channel_1",NotificationManager.IMPORTANCE_DEFAULT);
//        channel.setDescription("this is Channel 1");
//
//
//        NotificationChannel  channe2=new NotificationChannel(Chanel_2,"channel_2",NotificationManager.IMPORTANCE_DEFAULT);
//        channel.setDescription("this is Channel 2");
//
//        NotificationManager manager=getSystemService(NotificationManager.class);
//        manager.createNotificationChannel(channel);
//        manager.createNotificationChannel(channe2);
//    }
}
