package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class durkupeti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_durkupeti);
        Toast.makeText(durkupeti.this, "You have successfully logged in", Toast.LENGTH_SHORT).show();
    }
}