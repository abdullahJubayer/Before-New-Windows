package com.fci.shamim.moneytrackeretl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText UsernameEdt,UserpasswordEDT;
Button loginBtn;
String username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent=new Intent(getApplicationContext(),navigationactivity.class);
                startActivity(intent);


//        loginBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                username=UsernameEdt.getText().toString();
//                password=UserpasswordEDT.getText().toString();
//
//                if(username.equalsIgnoreCase("shamim") && password.equals("123456")){
//
//                    UsernameEdt.setText(null);
//                    UserpasswordEDT.setText(null);
//                }
//
//            }
//        });
    }
}
