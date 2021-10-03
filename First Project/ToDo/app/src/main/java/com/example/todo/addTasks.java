package com.example.todo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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



    View v;
    Switch sw;
    TextView expl,cond,givenT,deadline;
    EditText explaintationEt,conditionEt,givenTimeEt,deadlineEt;
    Button submitBtn;
    tasksVariables task;
    boolean isColor = true;
    DatabaseReference reff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtask);
        expl = findViewById(R.id.taskExpTx);
        cond = findViewById(R.id.taskConditionTx);
        givenT = findViewById(R.id.taskGivenTx);
        deadline = findViewById(R.id.taskDeadlineTx);
        explaintationEt = findViewById(R.id.taskExpEt);
        conditionEt = findViewById(R.id.taskCondEt);
        givenTimeEt = findViewById(R.id.taskGivenEt);
        deadlineEt = findViewById(R.id.taskDeadlineEt);
        submitBtn = findViewById(R.id.submitBtn);
        task = new tasksVariables();

        reff = FirebaseDatabase.getInstance().getReference("Tasks");



        Toast.makeText(addTasks.this, "You have successfully logged in", Toast.LENGTH_SHORT).show();

        v = this.getWindow().getDecorView();

        sw = findViewById(R.id.switch1);

        sw.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                if (isColor) {
                    v.setBackgroundResource(R.color.black);

                    sw.setTextColor(Color.WHITE);
                    isColor = false;
                } else {
                    v.setBackgroundResource(android.R.color.white);

                    sw.setTextColor(Color.BLACK);
                    isColor = true;
                }
            }
        });


    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    public void AddTask(View view)
    {
        task.setExplantation(explaintationEt.getText().toString().trim());
        task.setCondition(conditionEt.getText().toString().trim());
        task.setTaskgiven(givenTimeEt.getText().toString().trim());
        task.setDeadline(deadlineEt.getText().toString().trim());
        reff.push().setValue(task);
        Toast.makeText(addTasks.this,"Data inserted successfully",Toast.LENGTH_LONG).show();
    }
}