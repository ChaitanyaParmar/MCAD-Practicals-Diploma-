package com.example.mcad_pracs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Index2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index2);
        Intent intent = getIntent();
        String item = intent.getStringExtra("item");
        if(item.equals("Practical 3")) {
            Intent i1 = new Intent(Index2.this, Practical3.class);
            startActivity(i1);
            onBackPressed();
        }
        else if(item.equals("Practical 4")) {
            Intent i2 = new Intent(Index2.this, Practical4.class);
            startActivity(i2);
            onBackPressed();
        }
        else if(item.equals("Practical 5 (Linear)")) {
            Intent i3 = new Intent(Index2.this, Practical5_Linear.class);
            startActivity(i3);
            onBackPressed();
        }
        else if(item.equals("Practical 5 (Relative)")) {
            Intent i3_1 = new Intent(Index2.this, Practical5_Relative.class);
            startActivity(i3_1);
            onBackPressed();
        }
        else if(item.equals("Practical 5 (Table)")) {
            Intent i3_2 = new Intent(Index2.this, Practical5_Table.class);
            startActivity(i3_2);
            onBackPressed();
        }
        else if(item.equals("Practical 5 (Frame)")) {
            Intent i3_3 = new Intent(Index2.this, Practical5_Frame.class);
            startActivity(i3_3);
            onBackPressed();
        }
        else if(item.equals("Practical 5 (Absolute)")) {
            Intent i3_3 = new Intent(Index2.this, Practical5_Absolute.class);
            startActivity(i3_3);
            onBackPressed();
        }
        else if(item.equals("Practical 6")) {
            Intent i4 = new Intent(Index2.this, Practical6.class);
            startActivity(i4);
            onBackPressed();
        }
        else if(item.equals("Practical 7")) {
            Intent i5 = new Intent(Index2.this, Practical7.class);
            startActivity(i5);
            onBackPressed();
        }
        else if(item.equals("Practical 8")) {
            Intent i6 = new Intent(Index2.this, Practical8.class);
            startActivity(i6);
            onBackPressed();
        }
        else if(item.equals("Practical 9")) {
            Intent i7 = new Intent(Index2.this, Practical9.class);
            startActivity(i7);
            onBackPressed();
        }
        else if(item.equals("Practical 10")) {
            Intent i8 = new Intent(Index2.this, Practical10.class);
            startActivity(i8);
            onBackPressed();
        }
        else if(item.equals("Practical 11")) {
            Intent i9 = new Intent(Index2.this, Practical11.class);
            startActivity(i9);
            onBackPressed();
        }
        else if(item.equals("Practical 12")) {
            Intent i10 = new Intent(Index2.this, Practical12.class);
            startActivity(i10);
            onBackPressed();
        }
        else if(item.equals("Practical 13")) {
            Intent i11 = new Intent(Index2.this, Practical13.class);
            startActivity(i11);
            onBackPressed();
        }
        else if(item.equals("Practical 14")) {
            Intent i12 = new Intent(Index2.this, Practical14.class);
            startActivity(i12);
            onBackPressed();
        }
        else if(item.equals("Practical 15")) {
            Intent i13 = new Intent(Index2.this, Practical15.class);
            startActivity(i13);
            onBackPressed();
        }
        else if(item.equals("Practical 16")) {
            Intent i14 = new Intent(Index2.this, Practical16.class);
            startActivity(i14);
            onBackPressed();
        }
        else if(item.equals("Practical 17")) {
            Intent i15 = new Intent(Index2.this, Practical17.class);
            startActivity(i15);
            onBackPressed();
        }
        else if(item.equals("Practical 18")) {
            Intent i16 = new Intent(Index2.this, Practical18.class);
            startActivity(i16);
            onBackPressed();
        }
        else if(item.equals("Practical 19")) {
            Intent i17 = new Intent(Index2.this, Practical19.class);
            startActivity(i17);
            onBackPressed();
        }
        else if(item.equals("Practical 20")) {
            Intent i18 = new Intent(Index2.this, Practical20.class);
            startActivity(i18);
            onBackPressed();
        }
        else if(item.equals("Practical 21")) {
            Intent i19 = new Intent(Index2.this, Practical21.class);
            startActivity(i19);
            onBackPressed();
        }
        else if(item.equals("Practical 22")) {
            Intent i20 = new Intent(Index2.this, Practical22.class);
            startActivity(i20);
            onBackPressed();
        }
        else if(item.equals("Practical 23")) {
            Intent i21 = new Intent(Index2.this, Practical23.class);
            startActivity(i21);
            onBackPressed();
        }
        else if(item.equals("Practical 24")) {
            Intent i22 = new Intent(Index2.this, Practical24.class);
            startActivity(i22);
            onBackPressed();
        }
        else if(item.equals("Practical 25")) {
            Intent i23 = new Intent(Index2.this, Practical25.class);
            startActivity(i23);
            onBackPressed();
        }
        else if(item.equals("Practical 26")) {
            Intent i24 = new Intent(Index2.this, Practical26.class);
            startActivity(i24);
            onBackPressed();
        }
        else if(item.equals("Practical 26_1")) {
            Intent i24 = new Intent(Index2.this, Practical26_1.class);
            startActivity(i24);
            onBackPressed();
        }
        else if(item.equals("Practical 27")) {
            Intent i25 = new Intent(Index2.this, Practical27.class);
            startActivity(i25);
            onBackPressed();
        }
    }

}