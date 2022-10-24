package com.example.mcad_pracs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class Practical19 extends AppCompatActivity {
    ListView cars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical19);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        cars = findViewById(R.id.lvcars);
        final String[] a = {"Mustang","XUV700","Harrier","Creta","Scorpio","Compass","Baleno"};

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,a);
        cars.setAdapter(adapter);

        cars.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),Practical19_1.class);
                String item = a[i];
                intent.putExtra("item",item);
                startActivity(intent);
            }
        });
    }
}