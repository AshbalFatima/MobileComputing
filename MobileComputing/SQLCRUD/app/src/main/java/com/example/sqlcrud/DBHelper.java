package com.example.sqlcrud;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, "StudentDB.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create Table StudentDB(Name TEXT Primary Key, Department TEXT, Year TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop Table if exists StudentDB ");

    }

    public Boolean InsertData(String name,String dep,String year){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("Name",name);
        cv.put("Department",dep);
        cv.put("Year",year);
        long result=db.insert("StudentDB",null,cv);
        if(result==-1){
            return false;
        }
        else
            return true;

    }

    public Boolean DeleteData(String name){
        SQLiteDatabase db=this.getWritableDatabase();

        Cursor cur= db.rawQuery("Select * from StudentDb where name=?",new String[] {name});
        if(cur.getCount()>0)
        {
            long result=db.delete("StudentDB","name=?",new String[]{name});
            if(result==-1){
                return false;
            }
            else
                return true;
        }
        else
            return false;

    }

    public Boolean UpdateData(String name,String dep,String year){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();

        cv.put("Department",dep);
        cv.put("Year",year);

        Cursor cur= db.rawQuery("Select * from StudentDb where name=?",new String[] {name});
        if(cur.getCount()>0)
        {
            long result=db.update("StudentDB",cv,"name=?",new String[]{name});
            if(result==-1){
                return false;
            }
            else
                return true;
        }
        else
            return false;

    }

    public Cursor getData(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cur=db.rawQuery("Select * from StudentDB",null);
        return cur;
    }

}
