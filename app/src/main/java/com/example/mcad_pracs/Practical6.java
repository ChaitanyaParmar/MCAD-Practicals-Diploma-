package com.example.mcad_pracs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Practical6 extends AppCompatActivity {
    TextView textView1;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical6);
        textView1 = (TextView) findViewById(R.id.textView1);
        text = textView1.getText().toString();
        text = text + "\nInside onCreate Method";
        textView1.setText(text);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    protected void onStart() {
        super.onStart();
        text = textView1.getText().toString();
        text = text + "\nInside onStart Method";
        textView1.setText(text);
    }
    @Override
    protected void onResume() {
        super.onResume();
        text = textView1.getText().toString();
        text = text + "\nInside onResume Method";
        textView1.setText(text);
    }
    @Override
    protected void onPause() {
        super.onPause();
        text = textView1.getText().toString();
        text = text + "\nInside onPause Method";
        textView1.setText(text);
    }
    @Override
    protected void onStop() {
        super.onStop();
        text = textView1.getText().toString();
        text = text + "\nInside onStop Method";
        textView1.setText(text);
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        text = textView1.getText().toString();
        text = text + "\nInside onRestart Method";
        textView1.setText(text);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        text = textView1.getText().toString();
        text = text + "\nInside onDestory Method";
        textView1.setText(text);
    }
}