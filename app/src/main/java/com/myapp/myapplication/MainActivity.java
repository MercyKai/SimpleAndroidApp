package com.myapp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextLastName;
    private Button buttonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName = findViewById(R.id.editTextName);
        editTextLastName = findViewById(R.id.editTextLastName);
        buttonLogin = findViewById(R.id.button1);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = editTextName.getText().toString().trim();
                String lastName = editTextLastName.getText().toString().trim();
                if (firstName.isEmpty() || lastName.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Welcome, " + firstName + " " + lastName + "!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public static class SecondActivity extends  AppCompatActivity{
        @Override
        public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.second_activity);

        }
    }
}
