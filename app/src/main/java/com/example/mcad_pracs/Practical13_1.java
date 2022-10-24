package com.example.mcad_pracs;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Practical13_1 extends AppCompatActivity {
    String no1, no2;
    TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical13_1);
        ans = findViewById(R.id.textView);

        Intent i = getIntent();
        no1 = i.getStringExtra("Number 1 : ");
        no2 = i.getStringExtra("Number 2 : ");

        Integer n1 = Integer.parseInt(no1);
        Integer n2 = Integer.parseInt(no2);

        int n = n1 + n2;
        ans.setText("Addition of " + no1 + " and "+ no2 +" is : " + n);
    }
}