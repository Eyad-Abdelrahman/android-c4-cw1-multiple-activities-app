package com.example.name_age;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NewMainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_main2);


        ImageView b = findViewById(R.id.imageView2);
        TextView myname = findViewById(R.id.textView5);
        TextView myage = findViewById(R.id.textView7);

        Bundle info = getIntent().getExtras();

       String mynamefinally = info.getString("name");
       String myagefinally = info.getString("age");


        myname.setText(mynamefinally);
        myage.setText(myagefinally);

    }
}