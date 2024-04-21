package com.example.duaduasi.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        EditText emailEditText = findViewById(R.id.editTextText);
        EditText passwordEditText = findViewById(R.id.editTextText3);
        Button continueButton = findViewById(R.id.button);
        TextView registerTextView = findViewById(R.id.textView6);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (!email.isEmpty() && !password.isEmpty()) {
                    Toast.makeText(loginpage.this, "Email: " + email + ", Password: " + password, Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(loginpage.this, loadingglobe.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(loginpage.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                }
            }
        });

        registerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginpage.this, Register.class);
                startActivity(intent);
            }
        });
    }
}