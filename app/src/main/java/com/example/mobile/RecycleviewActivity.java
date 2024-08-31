package com.example.mobile;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleviewActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.recycleview);
        recyclerView = findViewById(R.id.recycleview);

        String[] name= {"Ram", "Shyam", "Hari", "Gita"};
        String[] address={"BKT", "KTM", "LTM", "CTM"};
        int [] image= {
                R.drawable.kayn,
                R.drawable.kayn,
                R.drawable.kayn,
                R.drawable.kayn
        };
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter= new RecyclerViewAdapter(this,name,address,image);
        recyclerView.setAdapter(adapter);
    }
}