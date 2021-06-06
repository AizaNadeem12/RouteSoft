package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CustomAdapter extends ArrayAdapter<String> {

    private String[] name;
    private  Integer[] imgid;
    private Activity context;

    public CustomAdapter(@NonNull Activity context, String[] name,Integer[] imgid) {
        super(context, R.layout.plan_menu,name);

        this.context=context;
        this.name=name;
        this.imgid=imgid;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View r=convertView;
        ViewHolder viewHolder=null;
        if(r==null)
        {
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.plan_menu,null,true);
            viewHolder=new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else{
            viewHolder=(ViewHolder) r.getTag();
        }

        viewHolder.ivw.setImageResource(imgid[position]);
        viewHolder.tvwl.setText(name[position]);
        return r;
    }

    class ViewHolder
    {
        ImageView ivw;
        TextView tvwl;
        ViewHolder(View v)
        {
            ivw=v.findViewById(R.id.pic);
            tvwl=v.findViewById(R.id.tflight);
        }

    }
}
