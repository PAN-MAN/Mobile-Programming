package com.example.mobile;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GridviewExampleActivity extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.gridview_example);

        gridView = findViewById(R.id.mygird);
        String name[]= {"Ram", "shyam", "Hari", "Sita", "Gira"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.gridview_items,R.id.textgird,name);
        gridView.setAdapter(adapter);
    }
}