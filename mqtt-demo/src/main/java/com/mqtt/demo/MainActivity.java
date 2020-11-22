package com.mqtt.demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.mqtt.demo.service.MyMqttService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyMqttService.startService(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}