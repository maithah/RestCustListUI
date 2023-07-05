package com.example.restcustlistui;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class UserDBManager {
    private DBHelper dbHelper;
    private Context context;
    private SQLiteDatabase db;
    public UserDBManager(Context context){
        this.context=context;
    }

    public UserDBManager openConnection(){
        dbHelper=new DBHelper(context);
        db=dbHelper.getWritableDatabase();
        return this;
    }
    public void closeConnection(){
        dbHelper.close();
    }

    public void save(String custId, String fullname,String address,String phone,String email,String gender,String age,String tableno, String totalcost){
        ContentValues values=new ContentValues();
        values.put("Customer ID",custId);
        values.put("Full Name",fullname);
        values.put("Address",address);
        values.put("Phone",phone);
        values.put("Email",email);
        values.put("Gender",gender);
        values.put("Age",age);
        values.put("Table Number",tableno);
        values.put("Total Cost",totalcost);


        db.insert("customer","",values);
    }
}
