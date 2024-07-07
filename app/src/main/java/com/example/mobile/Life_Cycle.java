package com.example.mobile;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Life_Cycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_life_cycle);
        Log.d ("Life Cycle Test", "Activity Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d ("LifeCycle Test", "Activity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d ("LifeCycle Test", "Activity Resumed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d ("LifeCycle Test", "Activity Restarted ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d ("LifeCycle Test", "Activity Paused ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d ("LifeCycle Test", "Activity Stoped ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d ("LifeCycle Test", "Activity Destoryed ");
    }
}