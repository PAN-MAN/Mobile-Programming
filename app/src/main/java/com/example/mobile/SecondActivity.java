package com.example.mobile;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.location.Address;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i=getIntent();
        int id=i.getIntExtra("id",0);
        String name=i.getStringExtra ("name");
        String address=i.getStringExtra ("Address");

//Displaying received data in TextView
        TextView txt = findViewById(R.id.txt);
        txt.setText ("Id="+id+"\n"+"Name="+name+"\n"+"Address="+ address) ;
    }
}