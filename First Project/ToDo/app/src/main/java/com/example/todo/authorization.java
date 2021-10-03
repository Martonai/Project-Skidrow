package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class authorization extends AppCompatActivity {

    Button addTasksBtn,showTasksBtn;
TextView txt;
View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);

        addTasksBtn = findViewById(R.id.addTasksBtn);
        showTasksBtn = findViewById(R.id.showTasksBtn);
        txt = findViewById(R.id.textView);
        Intent intent = getIntent();

        String authlevel = intent.getStringExtra("key");

       if(authlevel.equals("1"))
       {
          addTasksBtn.setVisibility(View.INVISIBLE);
       }
       else if(authlevel.equals("2"))
       {
           addTasksBtn.setVisibility(View.VISIBLE);
       }
       else
           {

           }





    }




    public void GoToAddTask(View view)
    {
        Intent intent = new Intent(authorization.this, addTasks.class);
        startActivity(intent);
    }

    public void GoToShowTask(View view)
    {
        Intent intent = new Intent(authorization.this, showTasks.class);
        startActivity(intent);
    }
}