package com.example.mcad_pracs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Practical16 extends AppCompatActivity {
    EditText n1, n2;
    TextView txt;
    Button btnAdd, btnSub, btnMul, btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical16);
        n1 = findViewById(R.id.editText1);
        n2 = findViewById(R.id.editText2);
        txt = findViewById(R.id.textView3);
        btnAdd = findViewById(R.id.buttonAdd);
        btnSub = findViewById(R.id.buttonSub);
        btnMul = findViewById(R.id.buttonMul);
        btnDiv = findViewById(R.id.buttonDiv);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int add = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                Toast.makeText(Practical16.this, "Addition : " + add, Toast.LENGTH_SHORT).show();
                int a, b, max;
                a = Integer.parseInt(n1.getText().toString());
                b = Integer.parseInt(n2.getText().toString());

                if(a > b){
                    max = a;
                }
                else{
                    max = b;
                }
                Toast.makeText(Practical16.this, "Max : " + max, Toast.LENGTH_SHORT).show();
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sub = Integer.parseInt(n1.getText().toString()) - Integer.parseInt(n2.getText().toString());
                Toast.makeText(Practical16.this, "Subtraction : " + sub, Toast.LENGTH_SHORT).show();

                int a, b, max;
                a = Integer.parseInt(n1.getText().toString());
                b = Integer.parseInt(n2.getText().toString());

                if(a > b){
                    max = a;
                }
                else{
                    max = b;
                }
                Toast.makeText(Practical16.this, "Max : " + max, Toast.LENGTH_SHORT).show();
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mul = Integer.parseInt(n1.getText().toString()) * Integer.parseInt(n2.getText().toString());
                Toast.makeText(Practical16.this, "Multiplication : " + mul, Toast.LENGTH_SHORT).show();

                int a, b, max;
                a = Integer.parseInt(n1.getText().toString());
                b = Integer.parseInt(n2.getText().toString());

                if(a > b){
                    max = a;
                }
                else{
                    max = b;
                }
                Toast.makeText(Practical16.this, "Max : " + max, Toast.LENGTH_SHORT).show();
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double div = Double.parseDouble(n1.getText().toString()) / Double.parseDouble(n2.getText().toString());
                Toast.makeText(Practical16.this, "Division : " + div, Toast.LENGTH_SHORT).show();

                double a, b, max;
                a = Double.parseDouble(n1.getText().toString());
                b = Double.parseDouble(n2.getText().toString());

                if(a > b){
                    max = a;
                }
                else{
                    max = b;
                }
                Toast.makeText(Practical16.this, "Max : " + max, Toast.LENGTH_SHORT).show();
            }
        });
    }
}