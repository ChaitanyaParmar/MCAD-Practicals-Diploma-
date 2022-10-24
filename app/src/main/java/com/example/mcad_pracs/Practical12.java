package com.example.mcad_pracs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Practical12 extends AppCompatActivity {

    Button btn1;
    ToggleButton btn2;
    ImageButton btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical12);

        btn1 = findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Practical12.this, "Normal Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn2 = findViewById(R.id.toggleButton);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Practical12.this, "Toggle Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn3 = findViewById(R.id.imageButton);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Practical12.this, "Image Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
