package com.example.mcad_pracs;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Practical17_1 extends AppCompatActivity {
    int n, i1;
    TextView multiText;
    String item = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical17_1);
        multiText = (TextView) findViewById(R.id.multiText);

        Intent i = getIntent();
        n = i.getIntExtra("no", 0);

        for(i1=0; i1<n; i1++){
            item += "Item "+ (i1+1) + "\n";
            multiText.setText(item);
        }
    }
}