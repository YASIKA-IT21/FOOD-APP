package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class request extends AppCompatActivity {
    Button request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
        request = (Button) findViewById(R.id.button4);

    }

    public void request(View view) {
        Toast.makeText(this, "Request sent", Toast.LENGTH_SHORT).show();
    }
}