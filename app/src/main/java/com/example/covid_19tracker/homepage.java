package com.example.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class homepage extends AppCompatActivity {
    TextView tmarquee, t1,t3;
    Button b1;
    ImageView p1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        tmarquee = findViewById(R.id.welcome);
        t1 = findViewById(R.id.text1);

        t1 = (TextView) findViewById(R.id.text1);

        // Now we will call setSelected() method
        // and pass boolean value as true
        t1.setSelected(true);

        b1 = findViewById(R.id.c1);

        tmarquee.setSelected(true);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(homepage.this, MainActivity.class));
            }
        });

    }
}