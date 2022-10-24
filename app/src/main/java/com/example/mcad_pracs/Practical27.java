package com.example.mcad_pracs;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Practical27 extends AppCompatActivity {
    EditText id, name, enroll, dept;
    Button insert, update, delete, view;
    DBHelper27 DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical27);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        id = (EditText) findViewById(R.id.id);
        name = (EditText) findViewById(R.id.name);
        enroll = (EditText) findViewById(R.id.enroll);
        dept = (EditText) findViewById(R.id.dept);
        insert = (Button) findViewById(R.id.insert);
        update = (Button) findViewById(R.id.update);
        delete = (Button) findViewById(R.id.delete);
        view = (Button) findViewById(R.id.view);
        DB = new DBHelper27(this);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int txtId = Integer.parseInt(id.getText().toString());
                String txtName = name.getText().toString();
                String txtEnroll = enroll.getText().toString();
                String txtDept = dept.getText().toString();
                Boolean checkInsertData = DB.insertData(txtId, txtName, txtEnroll, txtDept);
                if(checkInsertData==true)
                    Toast.makeText(Practical27.this, "New Record Inserted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(Practical27.this, "New Record Not Inserted", Toast.LENGTH_SHORT).show();
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int txtId = Integer.parseInt(id.getText().toString());
                String txtName = name.getText().toString();
                String txtEnroll = enroll.getText().toString();
                String txtDept = dept.getText().toString();
                Boolean checkUpdateData = DB.updateData(txtId, txtName, txtEnroll, txtDept);
                if(checkUpdateData==true)
                    Toast.makeText(Practical27.this, "Record Updated", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(Practical27.this, "Record Not Updated", Toast.LENGTH_SHORT).show();
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int txtId = Integer.parseInt(id.getText().toString());
                Boolean checkDeleteData = DB.deletedata(txtId);
                if(checkDeleteData==true)
                    Toast.makeText(Practical27.this, "Record Deleted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(Practical27.this, "Record Not Deleted", Toast.LENGTH_SHORT).show();
            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor c = DB.getdata();
                if(c.getCount()==0){
                    Toast.makeText(Practical27.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while(c.moveToNext()){
                    buffer.append("ID : "+c.getInt(0)+"\n");
                    buffer.append("Name : "+c.getString(1)+"\n");
                    buffer.append("Enrollment No : "+c.getString(2)+"\n");
                    buffer.append("Department : "+c.getString(3)+"\n\n");
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(Practical27.this);
                builder.setCancelable(true);
                builder.setTitle("User Data");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });
    }
}