package com.example.mcad_pracs;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Practical18 extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical18);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void GetUrlFromIntent(View view) {
        editText = findViewById(R.id.URL);
        String url = editText.getText().toString();
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}