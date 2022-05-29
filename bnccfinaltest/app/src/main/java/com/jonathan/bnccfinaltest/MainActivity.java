package com.jonathan.bnccfinaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);

        Button login = findViewById(R.id.loginbutton);

        TextView register = findViewById(R.id.register);

        SharedPreferences sp = getSharedPreferences("dataregister", MODE_PRIVATE);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().length() == 0) {
                    Toast.makeText(MainActivity.this, "Please fill in email", Toast.LENGTH_SHORT).show();
                } else {
                    if (password.getText().toString().length() == 0) {
                        Toast.makeText(MainActivity.this, "Please fill in password", Toast.LENGTH_SHORT).show();
                    } else {
                        if (!email.getText().toString().endsWith(".com") && !email.getText().toString().contains("@")) {
                            Toast.makeText(getApplicationContext(), "Email is not valid", Toast.LENGTH_SHORT).show();
                        } else {
                            if (!email.getText().toString().equals(findViewById(R.id.registeremail))) {
                                Toast.makeText(getApplicationContext(), "Email is wrong", Toast.LENGTH_SHORT).show();
                            } else {
                                if (!password.getText().toString().equals(findViewById(R.id.registerpassword))) {
                                    Toast.makeText(getApplicationContext(), "Password is wrong", Toast.LENGTH_SHORT).show();
                                } else {
                                    Intent toHome = new Intent(MainActivity.this, Homepage.class);
                                    startActivity(toHome);
                                }
                            }
                        }
                    }
                }
            }
                                 });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toRegister = new Intent(MainActivity.this, Register.class);
                startActivity(toRegister);
            }
        });
    }
}