package com.example.todo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class addTasks extends AppCompatActivity {




//Create elements

    EditText explaintationEt,conditionEt,givenTimeEt,deadlineEt,employeeEt;
    Button submitBtn;
    tasksVariables task;
    DatabaseReference reff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtask);
        //Declare elements variables

        explaintationEt = findViewById(R.id.taskExpEt);
        conditionEt = findViewById(R.id.taskCondEt);
        givenTimeEt = findViewById(R.id.taskGivenEt);
        deadlineEt = findViewById(R.id.taskDeadlineEt);

        employeeEt = findViewById(R.id.employeeEt);
        submitBtn = findViewById(R.id.submitBtn);
        task = new tasksVariables();

        //Get an instance from Tasks table
        reff = FirebaseDatabase.getInstance().getReference("Tasks").child("Task1");





    }

//Push the elements to the Firabse Database
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void AddTask(View view)
    {
        task.setExplantation(explaintationEt.getText().toString().trim());
        task.setCondition(conditionEt.getText().toString().trim());
        task.setTaskgiven(givenTimeEt.getText().toString().trim());
        task.setDeadline(deadlineEt.getText().toString().trim());
        task.setEmployee(employeeEt.getText().toString().trim());
        reff.push().setValue(task);

        Toast.makeText(addTasks.this,"Data inserted successfully",Toast.LENGTH_LONG).show();
    }


}