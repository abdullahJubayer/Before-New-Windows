package com.example.textinputdesign;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SqlHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="Database";
    private static final int DATABASE_VERSION=1;
    private static final String  TABLE_DEPOSIT="Deposit";
    private static final String  DEPOSIT_AMOUNT="Amount";
    private static final String  DEPOSIT_CATEGORY="Category";
    private static final String  DEPOSIT_CURRENT_DATE="CurrentDate";

    public SqlHelper(Context context) {
        super(context, DATABASE_NAME, null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String dipositTable="Create Table "+TABLE_DEPOSIT+" ("+DEPOSIT_AMOUNT+" Double,"+DEPOSIT_CATEGORY+" Text,"+DEPOSIT_CURRENT_DATE+" Date)";
        db.execSQL(dipositTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop Table IF EXISTS "+TABLE_DEPOSIT);
        onCreate(db);
    }

    public void insertData(Support data){

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
            values.put(DEPOSIT_AMOUNT,data.getAmount());
            values.put(DEPOSIT_CATEGORY,data.getCatagory());
            values.put(DEPOSIT_CURRENT_DATE,data.getCurrentDate());

            db.insert(TABLE_DEPOSIT,null,values);
            db.close();

    }

    static class Support{
        double amount;
        String catagory;
        String currentDate;

        public Support(double amount, String catagory, String currentDate) {
            this.amount = amount;
            this.catagory = catagory;
            this.currentDate = currentDate;
        }

        public double getAmount() {
            return amount;
        }

        public String getCatagory() {
            return catagory;
        }

        public String getCurrentDate() {
            return currentDate;
        }
    }
}


