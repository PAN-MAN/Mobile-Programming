package com.example.mobile;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity implements
        PopupMenu.OnMenuItemClickListener {

    Button button1;
    Button button2;

    @SuppressLint("missingInflatedId")


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMenu(v);
            }
        });
        registerForContextMenu(button1);
    }

    public void showMenu(View v){
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener((PopupMenu.OnMenuItemClickListener)this);
        popup.inflate(R.menu.menu);
        popup.show();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (R.id.item1 == id) {
            Toast.makeText(getApplicationContext(), "Search selected from context menu", Toast.LENGTH_LONG).show();
            return true;
        } else if (R.id.item2 == id) {
            Toast.makeText(getApplicationContext(), "Contact selected from context menu", Toast.LENGTH_LONG).show();
            return true;
        } else if (R.id.item3 == id) {
            Toast.makeText(getApplicationContext(), "About selected from context menu", Toast.LENGTH_LONG).show();
            return true;
        } else {
            return super.onContextItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (R.id.item1 == id) {
            Toast.makeText(getApplicationContext(), "Search selected from options menu", Toast.LENGTH_LONG).show();
            return true;
        } else if (R.id.item2 == id) {
            Toast.makeText(getApplicationContext(), "Contact selected from options menu", Toast.LENGTH_LONG).show();
            return true;
        } else if (R.id.item3 == id) {
            Toast.makeText(getApplicationContext(), "About selected from options menu", Toast.LENGTH_LONG).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        return false;
    }
}
