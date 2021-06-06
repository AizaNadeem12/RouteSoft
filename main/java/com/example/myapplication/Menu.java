package com.example.myapplication;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {
   ListView lst;
   TextView textView;
   String[] names={"Flights","Accomodations","Car Rental","Meetings","Directions","Map","Restaurant","Transportation"};
   Integer[] imgid={R.drawable.ic_flight,R.drawable.ic_local_hotel,R.drawable.ic_car,R.drawable.ic_computer_black_24dp,R.drawable.ic_directions,R.drawable.ic_map,R.drawable.ic_restaurant,R.drawable.ic_train};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_main);

        lst=(ListView) findViewById(R.id.lst);
        textView=(TextView) findViewById(R.id.tst);
        CustomAdapter customAdapter=new CustomAdapter(this,names,imgid);
        lst.setAdapter(customAdapter);

    }

}
