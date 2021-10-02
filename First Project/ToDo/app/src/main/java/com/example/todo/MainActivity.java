package com.example.todo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {


     TextView failedTx,welcomeTx;
     EditText emailET,passET;
     Button button;
     DatabaseReference[] references = new DatabaseReference[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Txmethods();
        ToastConnection();
        References();





    }
    public void Txmethods () {
        failedTx = findViewById(R.id.failedTx);
        welcomeTx = findViewById(R.id.welcomeTx);
        emailET = findViewById(R.id.emailET);
        passET = findViewById(R.id.passET);
        button = findViewById(R.id.loginBtn);
    }
    public void References () {

        references[0] = FirebaseDatabase.getInstance().getReference("Users").child("-Ml-2lVstn18z2E_QakY");
        references[1] = FirebaseDatabase.getInstance().getReference("Users").child("-Ml-2sQsb_dkXM_EvTxu");
        references[2] = FirebaseDatabase.getInstance().getReference("Users").child("-Ml-2yoNs_IVeoogPxFx");
        references[3] = FirebaseDatabase.getInstance().getReference("Users").child("-Ml-33D_5Ahezh8h2bRl");
        references[4] = FirebaseDatabase.getInstance().getReference("Users").child("-Ml-39LqUNzLAnX91e0z");

    }
    public void ValueMethod() {
        references[0].addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                GlobalVariables.emails[0] = snapshot.child("email").getValue().toString();
                GlobalVariables.passwords[0] = snapshot.child("password").getValue().toString();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        references[1].addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                GlobalVariables.emails[1] = snapshot.child("email").getValue().toString();
                GlobalVariables.passwords[1] = snapshot.child("password").getValue().toString();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        references[2].addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                GlobalVariables.emails[2] = snapshot.child("email").getValue().toString();
                GlobalVariables.passwords[2] = snapshot.child("password").getValue().toString();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }

        });
        references[3].addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                GlobalVariables.emails[3] = snapshot.child("email").getValue().toString();
                GlobalVariables.passwords[3] = snapshot.child("password").getValue().toString();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        references[4].addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                GlobalVariables.emails[4] = snapshot.child("email").getValue().toString();
                GlobalVariables.passwords[4] = snapshot.child("password").getValue().toString();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



    }
    public void MatchingMethod() {

        if (emailET.getText().toString().isEmpty() || passET.getText().toString().isEmpty()) {
            failedTx.setText("Empty datas");
        } else {
            //Fix the variable name issues due the array
            if (emailET.getText().toString().equals(GlobalVariables.emails[0]) && passET.getText().toString().equals(GlobalVariables.passwords[0])) {
                Intent intent = new Intent(MainActivity.this, gerixy20.class);
                startActivity(intent);

            } else if (emailET.getText().toString().equals(GlobalVariables.emails[1]) && passET.getText().toString().equals(GlobalVariables.passwords[1])) {
                Intent intent = new Intent(MainActivity.this, martoncsaba.class);
                startActivity(intent);

            } else if (emailET.getText().toString().equals(GlobalVariables.emails[2]) && passET.getText().toString().equals(GlobalVariables.passwords[2])) {
                Intent intent = new Intent(MainActivity.this, misinszkimarton.class);
                startActivity(intent);

            } else if (emailET.getText().toString().equals(GlobalVariables.emails[3]) && passET.getText().toString().equals(GlobalVariables.passwords[3])) {
                Intent intent = new Intent(MainActivity.this, durkupeti.class);
                startActivity(intent);

            } else if (emailET.getText().toString().equals(GlobalVariables.emails[4]) && passET.getText().toString().equals(GlobalVariables.passwords[4])) {
                Intent intent = new Intent(MainActivity.this, employee1.class);
                startActivity(intent);

            } else {
                failedTx.setText("Failed to login!");
            }
        }


    }
public void ToastConnection()
{
    Toast.makeText(this, "Waiting to communicate with the Firebase server", Toast.LENGTH_SHORT).show();
    Handler handler = new Handler();
    handler.postDelayed(new Runnable()
    {
        @Override
        public void run()
        {
            Toast.makeText(MainActivity.this, "Connection to the Firebase database was successfully", Toast.LENGTH_SHORT).show();
        }
    }, 3000);



}

    public void Login(View view) {


        ValueMethod();
        MatchingMethod();











    }
}