package com.example.mobile;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment);

        Spinner spin = findViewById(R.id.spinner);
        String[] courses = {"Valorant", "League of Legends", "Palworld", "Clash of clans", "PUBG"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, courses);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);

        addListenerOnButton();

    }
    public void addListenerOnButton() {
        EditText nam = findViewById(R.id.username);
        EditText Add = findViewById(R.id.userAddress);
        Button buttonShow = findViewById(R.id.button);
        TextView output1 = findViewById(R.id.output1);
        TextView output2 = findViewById(R.id.output2);
        CheckBox checkMale = findViewById(R.id.cmale);
        CheckBox checkFemale = findViewById(R.id.cfemale);
        RadioButton radioButton = findViewById(R.id.radio_50);
        RadioButton radioButton1 = findViewById(R.id.radio_100);

        // Set up button click listener
        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nam.getText().toString().trim();
                String address = Add.getText().toString().trim();
                String gender = "";
                String paisa = "";

                Spinner spin = findViewById(R.id.spinner);
                String selectedCourse = spin.getSelectedItem().toString();

                // Determine which CheckBox is checked
                if (checkMale.isChecked()) {
                    gender = "Male";
                } else if (checkFemale.isChecked()) {
                    gender = "Female";
                }

                if (radioButton.isChecked()) {
                    paisa = "Rs. 50 de mero";
                } else if (radioButton1.isChecked()) {
                    paisa = "Rs. 100 chai kaile dine";
                }

                // Display the entered text in TextViews
                output1.setText("Name: " + name);
                output2.setText("Address: " + address +
                        "\nGender: " + gender +
                        "\nPaisa: " + paisa +
                        "\nCourse: " + selectedCourse);
            }
        });
    }
}
