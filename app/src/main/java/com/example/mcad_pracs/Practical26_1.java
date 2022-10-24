package com.example.mcad_pracs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class Practical26_1 extends AppCompatActivity {
    Button btn1;
    ProgressBar pb1, pb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical26_1);

        btn1 = findViewById(R.id.button);

        pb1 = findViewById(R.id.progressBar);
        pb2 = findViewById(R.id.progressBar2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb1.setVisibility(View.VISIBLE);
                pb2.setVisibility(View.VISIBLE);
                pb2.setProgress(50);
            }
        });
    }
}

