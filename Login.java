package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText phone = findViewById(R.id.phone);
        final EditText password = findViewById(R.id.password);
        final Button loginBtn = findViewById(R.id.loginBtn);
        final TextView registerNowBtn = findViewById(R.id.registerNowBtn);
        final Button orderbtn = findViewById(R.id.orderbtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String phonetxt = phone.getText().toString();
                final String passwordtxt = password.getText().toString() ;
                if(phonetxt.isEmpty() || passwordtxt.isEmpty()){
                    Toast.makeText(Login.this, "Please Enter Your Mobile or Password", Toast.LENGTH_SHORT).show();
                }
                else{

                }
            }
        });
        registerNowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this,Register.class));
            }


        });
        orderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,page.class);
                startActivity(intent);
            }
        });

    }
}