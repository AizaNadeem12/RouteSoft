package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class restaurant extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant);
        getSupportActionBar().setTitle("Add Restaurant");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }
}
