package com.example.mobile;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CustomGridActivity extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.custom_grid);
        gridView= findViewById(R.id.mycustomgrid);

        String[] title={
                "Title 1", "Title 2"
                ,"Title 3", "Title 4"};
        String[] description = {
                "This is description 1",
                "This is description 2",
                "This is description 3",
                "This is description 4"
        };
        int[] image = {
                R.drawable.kayn,
                R.drawable.kayn,
                R.drawable.kayn,
                R.drawable.kayn
        };
        MyGridAdapter adapter = new MyGridAdapter(this,title,description,image);
        gridView.setAdapter(adapter);
    }
}