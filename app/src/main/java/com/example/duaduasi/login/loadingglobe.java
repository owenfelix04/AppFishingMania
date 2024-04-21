package com.example.duaduasi.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class loadingglobe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadingglobe);

        TextView lewatiTextView = findViewById(R.id.textView);
        TextView lanjutTextView = findViewById(R.id.textView2);

        lewatiTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loadingglobe.this, lokasi.class);
                startActivity(intent);
            }
        });

        lanjutTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loadingglobe.this, loadingkapal.class);
                startActivity(intent);
            }
        });
    }
}