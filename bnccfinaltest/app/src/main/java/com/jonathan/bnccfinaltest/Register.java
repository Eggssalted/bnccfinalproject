package com.jonathan.bnccfinaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText registerid = findViewById(R.id.registerid);
        EditText registeremail = findViewById(R.id.registeremail);
        EditText registername = findViewById(R.id.registername);
        EditText registerpassword = findViewById(R.id.registerpassword);
        EditText registerconfirmpassword = findViewById(R.id.registerconfirmpassword);

        Button registerbutton = findViewById(R.id.registerbutton);

        SharedPreferences sp = getSharedPreferences("dataregister", MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();

        registerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (registerid.getText().toString().equals("")) {
                    Toast.makeText(Register.this, "Please fill in Id", Toast.LENGTH_SHORT).show();
                } else {
                    if (registeremail.getText().toString().equals("")) {
                        Toast.makeText(Register.this, "Please fill in Email", Toast.LENGTH_SHORT).show();
                    } else {
                        if (!registeremail.getText().toString().contains("@") && !registeremail.getText().toString().endsWith(".com")) {
                            Toast.makeText(Register.this, "Email must have @ and end with .com", Toast.LENGTH_SHORT).show();
                        } else {
                            if (registername.getText().toString().equals("")) {
                                Toast.makeText(Register.this, "Please fill in Name", Toast.LENGTH_SHORT).show();
                            } else {
                                if (registername.getText().toString().equals("")) {
                                    Toast.makeText(Register.this, "Please fill in Name", Toast.LENGTH_SHORT).show();
                                } else {
                                    if (registerpassword.getText().toString().equals("")) {
                                        Toast.makeText(Register.this, "Please fill in password", Toast.LENGTH_SHORT).show();
                                    } else {
                                        if (!registerconfirmpassword.getText().toString().equals(registerpassword)) {
                                            Toast.makeText(Register.this, "Password and confirm password do not match", Toast.LENGTH_SHORT).show();
                                        } else {
                                            Toast.makeText(Register.this, "Account Successfuly made", Toast.LENGTH_SHORT).show();
                                            edit.putString("registername", registername.getText().toString());
                                            edit.putString("registerid", registerid.getText().toString());
                                            edit.putString("registeremail", registeremail.getText().toString());
                                            edit.putString("registerpassword", registerpassword.getText().toString());
                                            edit.apply();
                                            Intent tologin = new Intent(Register.this, MainActivity.class);
                                            startActivity(tologin);

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    });
    }
}

