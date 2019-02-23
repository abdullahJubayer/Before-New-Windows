package com.example.textinputdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SqlHelper helper=new SqlHelper(this);
        SqlHelper.Support support=new SqlHelper.Support(1000.0,"Salary","1/12/2019");
        helper.insertData(support);
    }
}
