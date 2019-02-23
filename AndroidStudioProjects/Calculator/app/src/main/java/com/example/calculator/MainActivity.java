package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textAns;
    Button btnOne,btnTwo,btnThree,btnFour,
            btnFive,btnSix,btnSeven,btnEight,
            btnNine,btnZero,btnDoubleZero,btnEqual,
            btnPlus,btnMinus,btnMultiply,btnDivider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne=findViewById(R.id.btn_one);
        btnTwo=findViewById(R.id.btn_two);
        btnThree=findViewById(R.id.btn_three);
        btnFour=findViewById(R.id.btn_four);
        btnFive=findViewById(R.id.btn_five);
        btnSix=findViewById(R.id.btn_six);
        btnSeven=findViewById(R.id.btn_seven);
        btnEight=findViewById(R.id.btn_eight);
        btnNine=findViewById(R.id.btn_nine);
        btnZero=findViewById(R.id.btn_zero);
        btnDoubleZero=findViewById(R.id.btn_double_zero);
        btnEqual=findViewById(R.id.btn_equal);
        btnPlus=findViewById(R.id.btn_plus);
        btnMinus=findViewById(R.id.btn_minus);
        btnMultiply=findViewById(R.id.btn_multiply);
        btnDivider=findViewById(R.id.btn_divider);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnDoubleZero.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivider.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
