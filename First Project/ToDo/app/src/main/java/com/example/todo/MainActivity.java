package com.example.todo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

//Main point
    TextView failedTx,welcomeTx;
    EditText emailET,passET;
    Button button;
    Switch darkSwitch;
    View v;
     boolean isColor = true;
     DatabaseReference[] references = new DatabaseReference[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Call methods

        Txmethods();
        ToastConnection();
        References();
        SetDarkMode();


    }

//Declare element variables
    public void Txmethods () {
        v = this.getWindow().getDecorView();
        failedTx = findViewById(R.id.failedTx);
        welcomeTx = findViewById(R.id.welcomeTx);
        emailET = findViewById(R.id.emailET);
        passET = findViewById(R.id.passET);
        button = findViewById(R.id.loginBtn);
        darkSwitch = findViewById(R.id.darkModeSwitch);
    }
    //Get references from database
    public void References () {

        references[0] = FirebaseDatabase.getInstance().getReference("Users").child("-Ml-2lVstn18z2E_QakY");
        references[1] = FirebaseDatabase.getInstance().getReference("Users").child("-Ml-2sQsb_dkXM_EvTxu");
        references[2] = FirebaseDatabase.getInstance().getReference("Users").child("-Ml-2yoNs_IVeoogPxFx");
        references[3] = FirebaseDatabase.getInstance().getReference("Users").child("-Ml-33D_5Ahezh8h2bRl");
        references[4] = FirebaseDatabase.getInstance().getReference("Users").child("-Ml-39LqUNzLAnX91e0z");

    }
    //Get values from database
    public void ValueMethod() {
        references[0].addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                GlobalVariables.emails[0] = snapshot.child("email").getValue().toString();
                GlobalVariables.passwords[0] = snapshot.child("password").getValue().toString();
                GlobalVariables.authLevel[0] = snapshot.child("permissionLevel").getValue().toString();

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
                GlobalVariables.authLevel[1] = snapshot.child("permissionLevel").getValue().toString();

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
                GlobalVariables.authLevel[2] = snapshot.child("permissionLevel").getValue().toString();

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
                GlobalVariables.authLevel[3] = snapshot.child("permissionLevel").getValue().toString();

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
                GlobalVariables.authLevel[4] = snapshot.child("permissionLevel").getValue().toString();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



    }
    //Validate login
    public void MatchingMethod() {

        if (emailET.getText().toString().isEmpty() || passET.getText().toString().isEmpty()) {
            failedTx.setText("Empty datas");
        } else {
            //Fix the variable name issues due the array
            if (emailET.getText().toString().equals(GlobalVariables.emails[0]) && passET.getText().toString().equals(GlobalVariables.passwords[0])) {
                Intent intent = new Intent(MainActivity.this, authorization.class);
                intent.putExtra("key",GlobalVariables.authLevel[0]);

                startActivity(intent);

            } else if (emailET.getText().toString().equals(GlobalVariables.emails[1]) && passET.getText().toString().equals(GlobalVariables.passwords[1])) {
                Intent intent = new Intent(MainActivity.this, authorization.class);
                intent.putExtra("key",GlobalVariables.authLevel[1]);

                startActivity(intent);



            } else if (emailET.getText().toString().equals(GlobalVariables.emails[2]) && passET.getText().toString().equals(GlobalVariables.passwords[2])) {
                Intent intent = new Intent(MainActivity.this, authorization.class);
                intent.putExtra("key",GlobalVariables.authLevel[2]);

                startActivity(intent);

            } else if (emailET.getText().toString().equals(GlobalVariables.emails[3]) && passET.getText().toString().equals(GlobalVariables.passwords[3])) {
                Intent intent = new Intent(MainActivity.this, authorization.class);
                intent.putExtra("key",GlobalVariables.authLevel[3]);

                startActivity(intent);

            } else if (emailET.getText().toString().equals(GlobalVariables.emails[4]) && passET.getText().toString().equals(GlobalVariables.passwords[4])) {
                Intent intent = new Intent(MainActivity.this, authorization.class);
                intent.putExtra("key",GlobalVariables.authLevel[4]);

                startActivity(intent);

            } else {
                failedTx.setText("Failed to login!");
            }
        }


    }
    //Make a toast depends on the connection
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
//Make a Login method for validation and getting values from database
    public void Login(View view) {


        ValueMethod();
        MatchingMethod();











    }

//Set the dark mode on the login screen
public void SetDarkMode()
{
    darkSwitch.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("ResourceType")
        @Override
        public void onClick(View view) {
            if (isColor) {
                v.setBackgroundResource(R.color.black);
                failedTx.setTextColor(Color.WHITE);
                emailET.setTextColor(Color.WHITE);
                passET.setTextColor(Color.WHITE);
                darkSwitch.setTextColor(Color.WHITE);
                darkSwitch.setText("Disable dark mode");
                isColor = false;


            } else {
                v.setBackgroundResource(android.R.color.white);
                failedTx.setTextColor(Color.BLACK);
                emailET.setTextColor(Color.BLACK);
                passET.setTextColor(Color.BLACK);
                darkSwitch.setTextColor(Color.BLACK);
                darkSwitch.setText("Enable dark mode");
                isColor = true;

            }
        }
    });

}



    }
