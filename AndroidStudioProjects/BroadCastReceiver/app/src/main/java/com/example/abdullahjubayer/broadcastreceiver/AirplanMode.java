package com.example.abdullahjubayer.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.util.TooManyListenersException;

public class AirplanMode extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.AIRPLANE_MODE")){
            Toast.makeText(context,"network Change",Toast.LENGTH_LONG).show();
        }
    }
}
