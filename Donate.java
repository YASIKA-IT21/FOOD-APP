package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Donate extends AppCompatActivity {
    Button order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
        order = (Button) findViewById(R.id.button);
    }
    public void donate(View view) {
        Toast.makeText(this, "Donated Successfully", Toast.LENGTH_SHORT).show();
    }
}