package com.example.biografia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button pantalla1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pantalla1 = (Button)findViewById(R.id.pantalla1);
        pantalla1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

            });
        pantalla1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent1);

            }
        });
        }
    }