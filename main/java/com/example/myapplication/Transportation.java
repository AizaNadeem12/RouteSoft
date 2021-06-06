package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Transportation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transport);
        getSupportActionBar().setTitle("Add Transportation");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }
}
