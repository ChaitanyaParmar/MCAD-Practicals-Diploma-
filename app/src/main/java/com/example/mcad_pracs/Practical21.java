package com.example.mcad_pracs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Practical21 extends AppCompatActivity {
    ListView games;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical21);
        games = (ListView) findViewById(R.id.list);
        final String[] gamesList = {"GTA V", "Cyberpunk", "Pac-Man", "Contra", "BGMI", "Warzone", "Super Mario", "Clash of Clans", "Watch Dogs", "Valorant", "CS:Go"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,gamesList);
        games.setAdapter(adapter);
        games.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = gamesList[i];
                Toast.makeText(Practical21.this, item + " is Selected!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}