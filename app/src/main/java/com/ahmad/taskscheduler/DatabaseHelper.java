package com.ahmad.taskscheduler;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String TAG = "DatabaseHelper";
    public static final String TABLE_NAME = "todo_table";
    public static final String Col1 = "ID";
    public static final String Col2 = "Name";
    public static final String Col3 = "Date";
    public static final String Col4 = "Time";

    public DatabaseHelper(Context context){
        super(context,TABLE_NAME,null,1);

    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME+"("+Col1+" integer primary key,"
                +Col2+"TEXT"+Col3+"DATE"+Col4+"TIME"+")";
        Log.d(TAG,"Creating table " + createTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
