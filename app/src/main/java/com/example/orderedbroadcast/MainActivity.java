package com.example.orderedbroadcast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/*
*主Activity   发送广播，bundle绑上key为a的数据
* */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button= (Button) findViewById(R.id.btn_butten);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent("com.song.123");
                Bundle bundle=new Bundle();
                bundle.putString("a", "aaa");
                intent.putExtras(bundle);
                //有序广播
                sendOrderedBroadcast(intent, null);
            }
        });
    }
}
