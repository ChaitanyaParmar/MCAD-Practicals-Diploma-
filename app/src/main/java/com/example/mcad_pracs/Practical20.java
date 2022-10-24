package com.example.mcad_pracs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Practical20 extends AppCompatActivity {
    ImageButton img;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical20);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        img = (ImageButton) findViewById(R.id.imageButton);
        img.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (i == 0) {
                    img.setImageResource(R.drawable.green);
                    i++;
                } else if (i == 1) {
                    img.setImageResource(R.drawable.red);
                    i = 0;
                }
                return true;
            }
        });
    }
}