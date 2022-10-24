package com.example.mcad_pracs;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Practical8 extends AppCompatActivity {
    Button btn;
    EditText uname, pass;
    String name, password;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical8);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btn = (Button) findViewById(R.id.btn);
        uname = (EditText) findViewById(R.id.uname);
        pass = (EditText) findViewById(R.id.pass);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = String.valueOf(uname.getText());
                password = String.valueOf(pass.getText());
                if (name.equals("Chaitanya") && password.equals("Abcd1234")) {
                    i = new Intent(Practical8.this, Practical8_1.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Login Failed!! ",Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Try Again... ",Toast.LENGTH_SHORT).show();
                    btn.setEnabled(false);
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            btn.setEnabled(true);
                        }
                    }, 4000);
                }
            }
        });
    }
}