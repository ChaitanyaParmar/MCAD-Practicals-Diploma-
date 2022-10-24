package com.example.mcad_pracs;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Practical9_1 extends AppCompatActivity {
    String name, mail, contact, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical9_1);

        Intent i = getIntent();
        name = i.getStringExtra("name");
        mail = i.getStringExtra("mail");
        contact = i.getStringExtra("contact");
        password = i.getStringExtra("password");

        Toast.makeText(Practical9_1.this, name, Toast.LENGTH_SHORT).show();
        Toast.makeText(Practical9_1.this, contact, Toast.LENGTH_SHORT).show();
        Toast.makeText(Practical9_1.this, mail, Toast.LENGTH_SHORT).show();
        Toast.makeText(Practical9_1.this, password, Toast.LENGTH_SHORT).show();
    }
}
