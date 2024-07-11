package com.example.mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button btn;
    TextView nameTextView; // Declare the TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();
        String data = i.getStringExtra("name"); // Get the data from the intent

        nameTextView = findViewById(R.id.txt); // Initialize the TextView
        nameTextView.setText(data); // Set the data as the text of the TextView

        btn = findViewById(R.id.but);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("message", "Hello First Activity!");
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }
}
