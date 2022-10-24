package com.example.mcad_pracs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Index extends AppCompatActivity {
    ListView pracs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        pracs = findViewById(R.id.pracs);
        final String[] a = {"Practical 3","Practical 4","Practical 5 (Linear)","Practical 5 (Relative)","Practical 5 (Table)","Practical 5 (Frame)","Practical 5 (Absolute)","Practical 6","Practical 7","Practical 8","Practical 9","Practical 10","Practical 11","Practical 12","Practical 13","Practical 14","Practical 15","Practical 16","Practical 17","Practical 18","Practical 19","Practical 20","Practical 21","Practical 22","Practical 23","Practical 24","Practical 25","Practical 26","Practical 26_1","Practical 27"};

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,a);
        pracs.setAdapter(adapter);

        pracs.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),Index2.class);
                String item = a[i];
                intent.putExtra("item",item);
                startActivity(intent);
            }
        });
    }
}