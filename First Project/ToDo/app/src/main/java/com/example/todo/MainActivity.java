package com.example.todo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {


     TextView failedTx,welcomeTx;
     EditText emailET,passET;
     Button button;
     DatabaseReference reff;
    DatabaseReference reff1;
    DatabaseReference reff2;
    DatabaseReference reff3;
    DatabaseReference reff4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        failedTx = findViewById(R.id.failedTx);
        welcomeTx = findViewById(R.id.welcomeTx);
        emailET = findViewById(R.id.emailET);
        passET = findViewById(R.id.passET);
        button = findViewById(R.id.loginBtn);

        reff = FirebaseDatabase.getInstance().getReference("Users").child("-Ml-2lVstn18z2E_QakY");
        reff1 = FirebaseDatabase.getInstance().getReference("Users").child("-Ml-2sQsb_dkXM_EvTxu");
        reff2 = FirebaseDatabase.getInstance().getReference("Users").child("-Ml-2yoNs_IVeoogPxFx");
        reff3 = FirebaseDatabase.getInstance().getReference("Users").child("-Ml-33D_5Ahezh8h2bRl");
        reff4 = FirebaseDatabase.getInstance().getReference("Users").child("-Ml-39LqUNzLAnX91e0z");
    }


    public void Login(View view)
    {



        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                GlobalVariables.email1=snapshot.child("email").getValue().toString();
                GlobalVariables.password1=snapshot.child("password").getValue().toString();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                GlobalVariables.email2=snapshot.child("email").getValue().toString();
                GlobalVariables.password2=snapshot.child("password").getValue().toString();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                GlobalVariables.email3=snapshot.child("email").getValue().toString();
                GlobalVariables.password3=snapshot.child("password").getValue().toString();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                GlobalVariables.email4=snapshot.child("email").getValue().toString();
                GlobalVariables.password4=snapshot.child("password").getValue().toString();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                GlobalVariables.email5=snapshot.child("email").getValue().toString();
                GlobalVariables.password5=snapshot.child("password").getValue().toString();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        if(emailET.getText().toString().equals(GlobalVariables.email1) && passET.getText().toString().equals(GlobalVariables.password1))
        {
             Intent intent = new Intent(MainActivity.this,gerixy20.class);
             startActivity(intent);

        }
        else if(emailET.getText().toString().equals(GlobalVariables.email2) && passET.getText().toString().equals(GlobalVariables.password2))
        {
            Intent intent = new Intent(MainActivity.this,martoncsaba.class);
            startActivity(intent);

        }

        else if(emailET.getText().toString().equals(GlobalVariables.email3) && passET.getText().toString().equals(GlobalVariables.password3))
        {
            Intent intent = new Intent(MainActivity.this,misinszkimarton.class);
            startActivity(intent);

        }

       else if(emailET.getText().toString().equals(GlobalVariables.email4) && passET.getText().toString().equals(GlobalVariables.password4))
        {
            Intent intent = new Intent(MainActivity.this,durkupeti.class);
            startActivity(intent);

        }

       else if(emailET.getText().toString().equals(GlobalVariables.email5) && passET.getText().toString().equals(GlobalVariables.password5))
        {
            Intent intent = new Intent(MainActivity.this,employee1.class);
            startActivity(intent);

        }
        else{
            failedTx.setText("Failed to login!");
        }
    }
}