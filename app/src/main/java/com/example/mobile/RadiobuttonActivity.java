package com.example.mobile;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RadiobuttonActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton genderradioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_radiobutton);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
    }

    public void onclickbuttonMethod(View v) {
        int selectedId = radioGroup.getCheckedRadioButtonId();
        genderradioButton = (RadioButton) findViewById(selectedId);
        if (selectedId == -1) {
            Toast.makeText(RadiobuttonActivity.this, "Nothing selected", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(RadiobuttonActivity.this, genderradioButton.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
