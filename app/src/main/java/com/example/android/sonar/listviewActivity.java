package com.example.android.sonar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class listviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
