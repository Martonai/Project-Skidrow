package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class misinszkimarton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misinszkimarton);
        Toast.makeText(misinszkimarton.this, "You have successfully logged in", Toast.LENGTH_SHORT).show();
    }
}