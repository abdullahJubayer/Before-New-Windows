package com.example.abdullahjubayer.multiplenotification;


import android.app.Notification;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;
import android.view.Display;
import android.widget.Toast;

import com.google.firebase.messaging.RemoteMessage;

import java.util.Random;

public class FirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        if (remoteMessage.getNotification() != null) {
            Log.d("InFOooooooo", "Message Notification Body: " + remoteMessage.getNotification().getBody());

            if (remoteMessage.getNotification().getTitle().equals("news")) {


                NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
                builder
                        .setSmallIcon(R.drawable.ic_launcher_background)
                        .setContentTitle(remoteMessage.getNotification().getTitle())
                        .setColor(getResources().getColor(R.color.colorPrimary))
                        .setAutoCancel(true)
                        .setContentText(remoteMessage.getNotification().getBody())
                ;

                Uri uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                builder.setSound(uri);


                Intent resultIntent = new Intent(this, Display.class);
                TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
                stackBuilder.addNextIntentWithParentStack(resultIntent);
                PendingIntent resultPendingIntent =
                        stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);


                builder.setContentIntent(resultPendingIntent);

                Random random = new Random();
                int id = random.nextInt(100);

                Notification notification = builder.build();
                NotificationManagerCompat.from(this).notify(id, notification);
            }
            {
                Toast.makeText(FirebaseMessagingService.this,"Not Subscribe",Toast.LENGTH_LONG).show();
            }
        }
    }
}
