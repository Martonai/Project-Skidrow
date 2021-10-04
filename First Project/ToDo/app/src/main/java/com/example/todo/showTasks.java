package com.example.todo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class showTasks extends AppCompatActivity {
    //Create elements
    TextView a,b,c,d,e;
    DatabaseReference[] references = new DatabaseReference[5];
    String[] values = new String[5];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_tasks);
        //Declare element variables
        a = findViewById(R.id.employeeSTxt);
        b = findViewById(R.id.explaintationSTxt);
        c = findViewById(R.id.conditionSTxt);
        d = findViewById(R.id.giventimeSTxt);
        e = findViewById(R.id.deadlineSTxt);
        References();



    }




    //Get values from Tasks->-M16xxxxxxx child table and set textview equals to values
    public void References () {

        references[0] = FirebaseDatabase.getInstance().getReference("Tasks").child("-Ml6UeOYki3Fh0wAxo_H");
        references[0].addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                values[0] = snapshot.child("employee").getValue().toString();
                values[1] = snapshot.child("explantation").getValue().toString();
                values[2] = snapshot.child("condition").getValue().toString();
                values[3] = snapshot.child("taskgiven").getValue().toString();
                values[4] = snapshot.child("deadline").getValue().toString();
                a.setText(values[0]);
                b.setText(values[1]);
                c.setText(values[2]);
                d.setText(values[3]);
                e.setText(values[4]);






            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

}