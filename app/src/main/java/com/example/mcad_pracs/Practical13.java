package com.example.mcad_pracs;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class Practical13 extends AppCompatActivity {
    Button button;
    EditText editText1, editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical13);

        button = findViewById(R.id.button);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no1 = editText1.getText().toString();
                String no2 = editText2.getText().toString();
                Intent i = new Intent(Practical13.this, Practical13_1.class);
                i.putExtra("Number 1 : ", no1);
                i.putExtra("Number 2 : ", no2);
                startActivity(i);
            }
        });
    }
}