package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    private Button orderbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText fullname = findViewById(R.id.fullname);
        final EditText email = findViewById(R.id.email);
        final EditText phone = findViewById(R.id.phone);
        final EditText password = findViewById(R.id.password);
        final EditText conpassword = findViewById(R.id.conpassword);
        final Button registerBtn = findViewById(R.id.registerBtn);
        final TextView loginNowBtn = findViewById(R.id.loginNow);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String fullnameTxt = fullname.getText().toString();
                final String emailTxt = email.getText().toString();
                final String phoneTxt = phone.getText().toString();
                final String passwordTxt = password.getText().toString();
                final String conpasswordTxt = conpassword.getText().toString();
                if(fullnameTxt.isEmpty() ||emailTxt.isEmpty()|| phoneTxt.isEmpty() ||passwordTxt.isEmpty() ){
                    Toast.makeText(Register.this, "Please fill in the fields", Toast.LENGTH_SHORT).show();
                }
                else if (
                        !passwordTxt.equals(conpasswordTxt)
                ){
                    Toast.makeText(Register.this, "Password is incorrect", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Register.this, "User Registration successful", Toast.LENGTH_SHORT).show();
                    finish();
                }


            }
        });
        loginNowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }



}