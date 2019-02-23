package com.example.bottomnavigation;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.getMenu().getItem(0).setChecked(false);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId()==R.id.daily_history){
            Intent intent=new Intent(MainActivity.this,Activity2.class);
            startActivity(intent);
        }
        if (menuItem.getItemId()==R.id.monthly_history){
            Intent intent=new Intent(MainActivity.this,Activity2.class);
            startActivity(intent);
        }
        if (menuItem.getItemId()==R.id.yearly_history){
            Intent intent=new Intent(MainActivity.this,Activity2.class);
            startActivity(intent);
        }
        return false;
    }
}
