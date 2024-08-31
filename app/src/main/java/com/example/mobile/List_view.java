package com.example.mobile;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class List_view extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.mylist);

        String Names[] ={"Ram", "Shyam", "Hari", "Fari", "Gari"};

        ArrayAdapter <String> adapter = new ArrayAdapter<String>
                (this,R.layout.activity_listview_item,R.id.text, Names);
        listView.setAdapter(adapter);
    }
}