package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class gerixy20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerixy20);
        Toast.makeText(gerixy20.this, "You have successfully logged in", Toast.LENGTH_SHORT).show();
    }
}