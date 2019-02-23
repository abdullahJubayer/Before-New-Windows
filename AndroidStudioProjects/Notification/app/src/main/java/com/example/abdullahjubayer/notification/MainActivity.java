 package com.example.abdullahjubayer.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;


 public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText text1,text2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text1=findViewById(R.id.title_id);
        text2=findViewById(R.id.message_id);
        button=findViewById(R.id.send_id);
        button.setOnClickListener(this);
    }

     @Override
     public void onClick(View v) {

        String Title=text1.getText().toString();
        String Message=text2.getText().toString();

        NotificationCompat.Builder builder=new NotificationCompat.Builder(this);
        builder
                .setSmallIcon(R.drawable.ic_account_box_black_24dp)
                .setContentTitle(Title)
                .setColor(getResources().getColor(R.color.Notification))
                .setLargeIcon(BitmapFactory.decodeResource(this.getResources(),R.drawable.one))
                .setAutoCancel(true)
                .setStyle(new NotificationCompat.InboxStyle().setSummaryText(Message))
                .setContentText(Message)
        ;

         Uri uri= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
         builder.setSound(uri);



         Intent resultIntent = new Intent(this, Display.class);
         TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
         stackBuilder.addNextIntentWithParentStack(resultIntent);
         PendingIntent resultPendingIntent =
                 stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);


         builder.setContentIntent(resultPendingIntent);

         Random random=new Random();
         int id=random.nextInt(100);

         Notification notification=builder.build();
         NotificationManagerCompat.from(this).notify(id,notification);
     }
 }
