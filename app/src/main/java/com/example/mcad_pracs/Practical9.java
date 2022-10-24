package com.example.mcad_pracs;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Practical9 extends AppCompatActivity {
    Button btnSave,btnReset;
    EditText txtName,txtMail, txtContact, txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical9);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnSave = findViewById(R.id.btnSave);
        btnReset = findViewById(R.id.btnReset);

        txtName = findViewById(R.id.txtName);
        txtMail = findViewById(R.id.txtMail);
        txtContact = findViewById(R.id.txtContact);
        txtPass = findViewById(R.id.txtPass);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name,pass,contact,mail;
                name = txtName.getText().toString();
                pass = txtPass.getText().toString();
                contact = txtContact.getText().toString();
                mail = txtMail.getText().toString();

                Intent i = new Intent(Practical9.this, Practical9_1.class);
                i.putExtra("name",name);
                i.putExtra("mail",mail);
                i.putExtra("contact",contact);
                i.putExtra("password",pass);
                startActivity(i);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtName.setText("");
                txtMail.setText("");
                txtPass.setText("");
                txtContact.setText("");
            }
        });
    }
}
