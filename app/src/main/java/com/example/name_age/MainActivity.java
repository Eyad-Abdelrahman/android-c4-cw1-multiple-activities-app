package com.example.name_age;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button go = findViewById(R.id.button2);
        ImageView a = findViewById(R.id.imageView);
        EditText name = findViewById(R.id.editTextTextPersonName2);
        EditText age = findViewById(R.id.editTextTextPersonName);


        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().isEmpty() || age.getText().toString().isEmpty()){
                    // Do Nothing...
                } else {
                    Intent i = new Intent(MainActivity.this, NewMainActivity2.class);
                    String name34 = name.getText().toString();
                    String age34 = age.getText().toString();
                    i.putExtra("name" , name34);
                    i.putExtra("age" , age34);
                    startActivity(i);
                }
            }
        });
    }
}