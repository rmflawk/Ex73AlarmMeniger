package com.youngstudio.ex73alarmmeniger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AlarmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        getSupportActionBar().setTitle("Alarm Activity");


    }
}
