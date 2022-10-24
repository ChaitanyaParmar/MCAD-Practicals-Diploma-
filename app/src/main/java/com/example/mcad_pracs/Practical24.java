package com.example.mcad_pracs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.graphics.Color;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class Practical24 extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical24);
        this.button = (Button) this.findViewById(R.id.button);
        registerForContextMenu(button);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_practical24option,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id =item.getItemId();
        ConstraintLayout c = findViewById(R.id.c);
        TextView t = findViewById(R.id.textView);

        if (id == R.id.Ored){
            c.setBackgroundColor(Color.RED);
            t.setTextColor(Color.WHITE);
            Toast.makeText(getApplicationContext(), "Red Is Selected From Option Menu!", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.Ogreen){
            c.setBackgroundColor(Color.GREEN);
            t.setTextColor(Color.WHITE);
            Toast.makeText(getApplicationContext(), "Green Is Selected From Option Menu!", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.Oblue){
            c.setBackgroundColor(Color.BLUE);
            t.setTextColor(Color.WHITE);
            Toast.makeText(getApplicationContext(), "Blue Is Selected From Option Menu!", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater=getMenuInflater();

        menu.add(0, v.getId(), 0, "Red");
        menu.add(0, v.getId(), 0, "Green");
        menu.add(0, v.getId(), 0, "Blue");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        ConstraintLayout c1 = findViewById(R.id.c);
        TextView t = findViewById(R.id.textView);
        if (item.getTitle() == "Red") {
            c1.setBackgroundColor(Color.RED);
            t.setTextColor(Color.WHITE);
            Toast.makeText(getApplicationContext(), "Red Is Selected From Context Menu!", Toast.LENGTH_SHORT).show();
        } else if (item.getTitle() == "Green") {
            c1.setBackgroundColor(Color.GREEN);
            t.setTextColor(Color.WHITE);
            Toast.makeText(getApplicationContext(), "Green Is Selected From Context Menu!", Toast.LENGTH_SHORT).show();
        } else if (item.getTitle() == "Blue") {
            c1.setBackgroundColor(Color.BLUE);
            t.setTextColor(Color.WHITE);
            Toast.makeText(getApplicationContext(), "Blue Is Selected From Context Menu!", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
