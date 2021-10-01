package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


     TextView failedTx,welcomeTx;
     EditText emailET,passET;
     Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        failedTx = findViewById(R.id.failedTx);
        welcomeTx = findViewById(R.id.welcomeTx);
        emailET = findViewById(R.id.emailET);
        passET = findViewById(R.id.passET);
        button = findViewById(R.id.loginBtn);
    }


    public void Login(View view)
    {
        String email = emailET.getText().toString();
        String pass = passET.getText().toString();

        if(email.equals(GlobalVariables.userEmails[0]) && pass.equals(GlobalVariables.userPasswords[0]))
        {
             Intent intent = new Intent(MainActivity.this,gerixy20.class);
             startActivity(intent);

        }
        else if(email.equals(GlobalVariables.userEmails[1]) && pass.equals(GlobalVariables.userPasswords[1]))
        {
            Intent intent = new Intent(MainActivity.this,martoncsaba.class);
            startActivity(intent);
        }
       else if(email.equals(GlobalVariables.userEmails[2]) && pass.equals(GlobalVariables.userPasswords[2]))
        {
            Intent intent = new Intent(MainActivity.this,misinszkimarton.class);
            startActivity(intent);
        }
       else if(email.equals(GlobalVariables.userEmails[3]) && pass.equals(GlobalVariables.userPasswords[3]))
        {
            Intent intent = new Intent(MainActivity.this,durkupeti.class);
            startActivity(intent);
        }
       else if(email.equals(GlobalVariables.userEmails[4]) && pass.equals(GlobalVariables.userPasswords[4]))
        {
            Intent intent = new Intent(MainActivity.this,employee1.class);
            startActivity(intent);
        }
        else{
            failedTx.setText("Failed to login!");
        }
    }
}