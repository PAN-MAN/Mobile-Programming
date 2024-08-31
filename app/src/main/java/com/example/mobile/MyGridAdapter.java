package com.example.mobile;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyGridAdapter extends ArrayAdapter<String> {

    Activity context;
    String[] title;

    String[] description;

    int[] image;

    public MyGridAdapter (Activity context, String[] title, String[] description, int[] image){
        super(context, R.layout.customgird_list,title);
        this.context=context;
        this.title=title;
        this.description=description;
        this.image=image;
    }
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.customgird_list,null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.titlegid);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imagegid);
        TextView txtdescription = (TextView) rowView.findViewById(R.id.descgird);

        txtTitle.setText(title[position]);
        imageView.setImageResource(image[position]);
        txtdescription.setText(description[position]);

        return rowView;

    }
}
