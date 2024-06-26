package com.example.mobile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        EditText nam = findViewById(R.id.username);
        EditText Add = findViewById(R.id.userAddress);
        Button buttonShow = findViewById(R.id.button);
        TextView output1 = findViewById(R.id.output1);
        TextView output2 = findViewById(R.id.output2);
        CheckBox checkMale = findViewById(R.id.check);
        CheckBox checkFemale = findViewById(R.id.check2);

        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the entered text from EditText fields
                String name = nam.getText().toString().trim();
                String address = Add.getText().toString().trim();
                String gender = "";

                // Determine which CheckBox is checked
                if (checkMale.isChecked()) {
                    gender = "Male";
                } else if (checkFemale.isChecked()) {
                    gender = "Female";
                }

                // Display the entered text in TextViews
                output1.setText("Name: " + name);
                output2.setText("Address: " + address + "\nGender: " + gender);
            }
        });
    }
}
