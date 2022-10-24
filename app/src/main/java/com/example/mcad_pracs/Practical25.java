package com.example.mcad_pracs;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Practical25 extends AppCompatActivity {
    Button btnYes, btnNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical25);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnYes = (Button) findViewById(R.id.button6);
        btnNo = (Button) findViewById(R.id.button7);

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Practical25.this);
                alertDialogBuilder.setMessage("Would You Like to Rate Us?");
                alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Toast.makeText(Practical25.this,"You Clicked YES Button",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Practical25.this,"You Clicked NO Button",Toast.LENGTH_SHORT).show();

                    }
                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Practical25.this);
                alertDialogBuilder.setMessage("Would You Like to Tell Us Why?");
                alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Toast.makeText(Practical25.this,"You Clicked YES Button",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Practical25.this,"You Clicked NO Button",Toast.LENGTH_SHORT).show();

                    }
                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
    }
}