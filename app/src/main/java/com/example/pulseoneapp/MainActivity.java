package com.example.pulseoneapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);

        MaterialButton loginbtn = findViewById(R.id.loginbtn);

        //admin
        loginbtn.setOnClickListener(v -> {
            if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                //correct
                Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_SHORT).show();
            } else {
                //incorrect
                Toast.makeText(MainActivity.this, "Not login", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.user_menu, menu);
        return true;
    }
}