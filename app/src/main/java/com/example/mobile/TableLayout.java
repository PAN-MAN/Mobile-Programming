package com.example.mobile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TableLayout extends AppCompatActivity {

    private EditText editTextName, editTextAddress;
    private Button buttonShowOutput;
    private TextView textViewOutput1, textViewOutput2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);

        // Initialize UI elements
        editTextName = findViewById(R.id.editTextName);
        editTextAddress = findViewById(R.id.editTextAddress);
        buttonShowOutput = findViewById(R.id.button);
        textViewOutput1 = findViewById(R.id.output1);
        textViewOutput2 = findViewById(R.id.output2);

        // Set click listener for the button
        buttonShowOutput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the entered text from EditText fields
                String name = editTextName.getText().toString().trim();
                String address = editTextAddress.getText().toString().trim();

                // Display the entered text in TextViews.
                textViewOutput1.setText("Name: " + name);
                textViewOutput2.setText("Address: " + address);
            }
        });
    }
}