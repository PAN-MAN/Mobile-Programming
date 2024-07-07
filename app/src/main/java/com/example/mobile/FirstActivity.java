package com.example.mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        View txt = findViewById(R.id.text100);
        View btn = findViewById(R.id.butt);
        btn.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent i=new Intent (FirstActivity.this,
                        SecondActivity.class);
                startActivityForResult (i,2);
            }
            @Override
            protected void onActivityResult (int requestCode, int resultCode, Intent data)
            {
                super.onActivityResult (requestCode, resultCode, data);
                if (requestCode==2)
                {
                    String message=data.getStringExtra ("message");
                    txt.setText (message);
                }
            }
        });
    }
}