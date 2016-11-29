package com.example.orderedbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/11/29 0029.
 * 优先接到广播，bundle绑上key为b的数据
 */

public class MyReceiver2 extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("receiver2");
//      context.getSystemService(name);
        Bundle bundle=intent.getExtras();
        bundle.putString("b", "bbb");
        System.out.println("a="+bundle.get("a"));

        Toast.makeText(context, "a="+bundle.get("a"), Toast.LENGTH_SHORT).show();

        setResultExtras(bundle);
        //切断广播
     abortBroadcast();
    }
}
