package com.bw.luzz.yueweieng;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by Luzz on 2016/3/22.
 */
public class DBHelper extends SQLiteOpenHelper{
    private Context mContext;
    private SQLiteDatabase db;
    public final static String CREATE_TABLE="create table world(" +
            "id integer primary key autoincrement," +
            "world text," +
            "info text)";

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        Toast.makeText(mContext,"success",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    /*public void insertWorld(String[] worldandinfo){
        db.execSQL("insert into world(world,info) values(?,?)",worldandinfo);
    }*/

}
