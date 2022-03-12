package com.example.name_age;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button go = findViewById(R.id.button2);
        EditText name = findViewById(R.id.editTextTextPersonName2);
        EditText age = findViewById(R.id.editTextTextPersonName);




        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,NewMainActivity2.class);
                startActivity(i);
            }
        });
    }
}