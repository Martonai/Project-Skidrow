package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewManager;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class gerixy20 extends AppCompatActivity {


    TextView txt;
    Button button;
    View v;
    Switch sw;
    boolean isColor = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerixy20);
        Toast.makeText(gerixy20.this, "You have successfully logged in", Toast.LENGTH_SHORT).show();

        v = this.getWindow().getDecorView();
        button = (Button) findViewById(R.id.btn);
        txt = findViewById(R.id.textView);
        sw = findViewById(R.id.switch1);

        sw.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                if (isColor) {
                    v.setBackgroundResource(R.color.black);
                    txt.setTextColor(Color.WHITE);
                    sw.setTextColor(Color.WHITE);
                    isColor = false;
                } else {
                    v.setBackgroundResource(android.R.color.white);
                    txt.setTextColor(Color.BLACK);
                    sw.setTextColor(Color.BLACK);
                    isColor = true;
                }
            }
        });


    }




}