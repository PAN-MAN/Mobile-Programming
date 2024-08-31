package com.example.mobile;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class customList extends AppCompatActivity {

    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_list);
        listview = findViewById(R.id.mycustomlist);

        String [] title ={"Title1",
                "Title2",
                "Title3",
                "Title4"};
        String [] description ={"Des1",
                "Des2",
                "Des3",
                "Des4"};
        int [] image = {
                R.drawable.kayn,
                R.drawable.kayn,
                R.drawable.kayn,
                R.drawable.kayn
        };
        MylistAdapter adapter= new MylistAdapter(this,title,description,image);
        listview.setAdapter(adapter);
    }
}