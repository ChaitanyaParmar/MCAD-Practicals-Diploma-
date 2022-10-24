package com.example.mcad_pracs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Practical23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical23);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public boolean onCreateOptionsMenu(Menu m){
        getMenuInflater().inflate(R.menu.menu_practical23,m);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem mi){

        switch(mi.getItemId()){
            case R.id.bookmark:
                Toast.makeText(this,"You Clicked Bookmark",Toast.LENGTH_SHORT).show();
                break;
            case R.id.file:
                Toast.makeText(this,"You Clicked File",Toast.LENGTH_SHORT).show();
                break;
            case R.id.neww:
                Toast.makeText(this,"You Clicked New",Toast.LENGTH_SHORT).show();
                break;
            case R.id.open:
                Toast.makeText(this,"You Clicked Open",Toast.LENGTH_SHORT).show();
                break;
            case R.id.save:
                Toast.makeText(this,"You Clicked Save",Toast.LENGTH_SHORT).show();
                break;
            case R.id.saveas:
                Toast.makeText(this,"You Clicked Save As",Toast.LENGTH_SHORT).show();
                break;
            case R.id.exit:
                Toast.makeText(this,"You Clicked Exit",Toast.LENGTH_SHORT).show();
                break;
            case R.id.search:
                Toast.makeText(this,"You Clicked Search",Toast.LENGTH_SHORT).show();
                break;
            case R.id.share:
                Toast.makeText(this,"You Clicked Share",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}