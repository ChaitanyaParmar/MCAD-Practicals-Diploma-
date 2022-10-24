package com.example.mcad_pracs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Practical22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical22);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_practical22,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id =item.getItemId();
        ConstraintLayout c = findViewById(R.id.c);
        TextView t = findViewById(R.id.textView);

        if (id == R.id.file){
            Toast.makeText(getApplicationContext(), "File Is Selected!", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.neww){
            Toast.makeText(getApplicationContext(), "New Is Selected!", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.open){
            Toast.makeText(getApplicationContext(), "Open Is Selected!", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.save){
            Toast.makeText(getApplicationContext(), "Save Is Selected!", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.saveas){
            Toast.makeText(getApplicationContext(), "Save As Is Selected!", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.edit){
            Toast.makeText(getApplicationContext(), "Edit Is Selected!", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.undo){
            Toast.makeText(getApplicationContext(), "Undo Is Selected!", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.cut){
            Toast.makeText(getApplicationContext(), "Cut Is Selected!", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.copy){
            Toast.makeText(getApplicationContext(), "Copy Is Selected!", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.paste){
            Toast.makeText(getApplicationContext(), "Paste Is Selected!", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.delete){
            Toast.makeText(getApplicationContext(), "Delete Is Selected!", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.view){
            Toast.makeText(getApplicationContext(), "View Is Selected!", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.tools){
            Toast.makeText(getApplicationContext(), "Tools Is Selected!", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.appearance){
            Toast.makeText(getApplicationContext(), "Appearance Is Selected!", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.recent){
            Toast.makeText(getApplicationContext(), "Recent Files Is Selected!", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}