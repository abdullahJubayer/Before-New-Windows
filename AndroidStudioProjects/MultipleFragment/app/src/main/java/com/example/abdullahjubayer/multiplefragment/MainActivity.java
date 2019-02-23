package com.example.abdullahjubayer.multiplefragment;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView frag_1,frag_2,frag_3;
    ViewPager viewPager;
    Fragment_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag_1=findViewById(R.id.fr_1);
        frag_2=findViewById(R.id.fr_2);
        frag_3=findViewById(R.id.fr_3);

        frag_1.setOnClickListener(this);
        frag_2.setOnClickListener(this);
        frag_3.setOnClickListener(this);

        viewPager=findViewById(R.id.view_pager);

        adapter=new Fragment_Adapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                changepage(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });


    }



    private void changepage(int i) {
        if (i==0){
            frag_1.setTextColor(getResources().getColor(R.color.selected_item));
            frag_1.setTextSize(20);

            frag_2.setTextColor(getResources().getColor(R.color.non_selected_item));
            frag_2.setTextSize(17);

            frag_3.setTextColor(getResources().getColor(R.color.non_selected_item));
            frag_3.setTextSize(17);
        }
        if (i==1){

            frag_1.setTextColor(getResources().getColor(R.color.non_selected_item));
            frag_1.setTextSize(17);

            frag_2.setTextColor(getResources().getColor(R.color.selected_item));
            frag_2.setTextSize(20);

            frag_3.setTextColor(getResources().getColor(R.color.non_selected_item));
            frag_3.setTextSize(17);
        }
        if (i==2){

            frag_1.setTextColor(getResources().getColor(R.color.non_selected_item));
            frag_1.setTextSize(17);

            frag_2.setTextColor(getResources().getColor(R.color.non_selected_item));
            frag_2.setTextSize(17);

            frag_3.setTextColor(getResources().getColor(R.color.selected_item));
            frag_3.setTextSize(20);
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.fr_1){
            viewPager.setCurrentItem(0);
        }
        if (v.getId()==R.id.fr_2){
            viewPager.setCurrentItem(1);
        }
        if (v.getId()==R.id.fr_3){
            viewPager.setCurrentItem(2);
        }
    }
}
