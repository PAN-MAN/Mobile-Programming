package com.example.mobile;

import android.app.Activity;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter {
    Activity context;
    int[] image;
    String [] name;
    String [] address;
    public RecyclerViewAdapter(Activity context, String[] name, String[] address, int[] image) {
        this.name=name;
        this.address= address;
        this.image=image;
        this.context=context;
    }
}
