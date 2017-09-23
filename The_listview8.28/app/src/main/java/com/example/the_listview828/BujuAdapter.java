package com.example.the_listview828;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static android.R.attr.data;

/**
 * Created by Administrator on 2017/8/28.
 */

public class BujuAdapter extends ArrayAdapter<Buju> {
    private  int resourceId;
    public BujuAdapter(Context context, int textViewResourceId, List<Buju> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }
    public View getView(int positoin, View converView, ViewGroup parent){
        Buju buju1=getItem(positoin);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView textView= (TextView) view.findViewById(R.id.listview001);
        ImageView imageView= (ImageView) view.findViewById(R.id.image001);
        ImageView imageView1= (ImageView) view.findViewById(R.id.image002);
        imageView.setImageResource(buju1.getImageId());
        textView.setText(buju1.getName());
        return view;

    }
}
