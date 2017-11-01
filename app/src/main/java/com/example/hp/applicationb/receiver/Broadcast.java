package com.example.hp.applicationb.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.example.hp.applicationb.activity.SubB;

/**
 * Created by hp on 11/2/2017.
 */

public class Broadcast extends BroadcastReceiver {
    public static String KEY_MESSAGE_B="message_b";
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,intent.getStringExtra(KEY_MESSAGE_B), Toast.LENGTH_LONG).show();
        intent=new Intent(context, SubB.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
