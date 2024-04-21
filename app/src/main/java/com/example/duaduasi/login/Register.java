package com.example.duaduasi.login;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
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

        EditText fullNameEditText = findViewById(R.id.editTextText2);
        EditText emailEditText = findViewById(R.id.editTextText4);
        EditText passwordEditText = findViewById(R.id.editTextText5);
        Button registerButton = findViewById(R.id.button);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullName = fullNameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (!fullName.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
                    Toast.makeText(Register.this, "Full Name: " + fullName + ", Email: " + email + ", Password: " + password, Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Register.this, loginpage.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Register.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}