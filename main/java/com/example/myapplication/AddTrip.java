package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class AddTrip extends AppCompatActivity {

     EditText stdate;
     EditText endate;
    DatePickerDialog.OnDateSetListener setListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_trip);
        getSupportActionBar().setTitle("Add Trip");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        stdate=findViewById(R.id.st_date);
        endate=findViewById(R.id.en_date);

        Calendar calendar= Calendar.getInstance();
         final int year=calendar.get(Calendar.YEAR);
         final int month=calendar.get(Calendar.MONTH);
         final int day=calendar.get(Calendar.DAY_OF_MONTH);

        /*stdate.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                DatePickerDialog datePickerDialog=new DatePickerDialog(
                        AddTrip.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,setListener,year,month,day);
                  datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                  datePickerDialog.show();
            }
        });

        setListener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month=month+1;
                String date=day+"/"+month+"/"+year;
                stdate.setText(date);
            }
        };*/
        stdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog=new DatePickerDialog(
                        AddTrip.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int day) {
                        month = month + 1;
                        String date = day + "/" + month + "/" + year;
                        stdate.setText(date);
                    }
                },year,month,day);
                datePickerDialog.show();

            }
        });

       endate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               DatePickerDialog datePickerDialog=new DatePickerDialog(
                       AddTrip.this, new DatePickerDialog.OnDateSetListener() {
                   @Override
                   public void onDateSet(DatePicker view, int year, int month, int day) {
                       month = month + 1;
                       String date = day + "/" + month + "/" + year;
                       endate.setText(date);
                   }
               },year,month,day);
               datePickerDialog.show();

           }
       });
        }
}
