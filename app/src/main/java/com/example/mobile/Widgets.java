package com.example.mobile;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Widgets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wigets);
        final Button helloButton = findViewById(R.id.button3);
        helloButton.setText("MEOW");
    }
}
