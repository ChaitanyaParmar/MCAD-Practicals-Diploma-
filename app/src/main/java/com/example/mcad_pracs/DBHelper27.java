package com.example.mcad_pracs;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper27 extends SQLiteOpenHelper {
    public DBHelper27(Context context) {
        super(context, "User.db", null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("Create Table UserData (id INTEGER primary key, name TEXT, enroll_no TEXT, dept TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int oldVersion, int newVersion) {
        DB.execSQL("drop Table if exists UserData");
    }

    public boolean insertData(int id, String name, String enroll_no, String dept){
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", id);
        contentValues.put("name", name);
        contentValues.put("enroll_no", enroll_no);
        contentValues.put("dept", dept);
        long result=DB.insert("UserData", null, contentValues);
        if(result==-1){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean updateData(int id, String name, String enroll_no, String dept){
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("enroll_no", enroll_no);
        contentValues.put("dept", dept);
        Cursor cursor = DB.rawQuery("Select * from UserData where id = ?", new String[]{String.valueOf(id)});
        if (cursor.getCount() > 0) {
            long result = DB.update("UserData", contentValues, "id=?", new String[]{String.valueOf(id)});
            if (result == -1) {
                return false;
            }
            else {
                return true;
            }
        } else {
            return false;
        }
    }

    public boolean deletedata (int id)
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("Select * from UserData where id = ?", new String[]{String.valueOf(id)});
        if (cursor.getCount() > 0) {
            long result = DB.delete("UserData", "id=?", new String[]{String.valueOf(id)});
            if (result == -1) {
                return false;
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }

    public Cursor getdata ()
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("Select * from UserData", null);
        return cursor;
    }
}

