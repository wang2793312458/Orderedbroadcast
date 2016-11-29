package com.example.orderedbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * 接收从receiver2传来的广播，包含key为a和b的数据
 */

public class MyReceiver1 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("receiver1");
        //要不要接受上一个广播接收器receiver2传来的的数据
        Bundle bundle=getResultExtras(true);
        System.out.println("a="+bundle.getString("a")+",b="+bundle.getString("b"));
    }
}
