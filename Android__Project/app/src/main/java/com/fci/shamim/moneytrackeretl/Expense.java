package com.fci.shamim.moneytrackeretl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

public class Expense extends AppCompatActivity {
TextView showDateTv;
DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense);
               showDateTv=findViewById(R.id.ShowDatetvId);
        datePicker=findViewById(R.id.DatePickerId);

        showDateTv.setText(currentDate());

        showDateTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePicker.setVisibility(View.VISIBLE);
                showDateTv.setText(currentDate());
            }
        });
    }

    String currentDate(){
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(datePicker.getDayOfMonth()+"/");
        stringBuffer.append(datePicker.getMonth()+1+"/");
        stringBuffer.append(datePicker.getYear());

      return   stringBuffer.toString();
    }
}
