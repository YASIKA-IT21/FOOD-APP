package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page extends AppCompatActivity {
    Button donate, request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
        donate = (Button) findViewById(R.id.button3);
        request = (Button) findViewById(R.id.button2);


    }
    public void donate(View view){
        donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page.this,Donate.class);
                startActivity(intent);
            }
        });
    }

    public void request(View view) {
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page.this,request.class);
                startActivity(intent);
            }
        });

    }
}