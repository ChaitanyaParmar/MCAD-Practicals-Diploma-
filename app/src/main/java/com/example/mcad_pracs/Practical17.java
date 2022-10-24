package com.example.mcad_pracs;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Practical17 extends AppCompatActivity {
    EditText item;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical17);
        item = (EditText) findViewById(R.id.item);
        btn = (Button) findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(item.getText().toString());
                Intent i = new Intent(Practical17.this, Practical17_1.class);
                i.putExtra("no", n);
                startActivity(i);
            }
        });
    }
}