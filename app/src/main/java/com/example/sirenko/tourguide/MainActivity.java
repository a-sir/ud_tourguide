package com.example.sirenko.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openCategory(View view) {
        switch(view.getId()) {
            case R.id.tv_cat_restaurants:
                Intent openRest = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(openRest);
            case R.id.tv_cat_museums:
            case R.id.tv_cat_cinemas:
            case R.id.tv_cat_hospitals:
            default:
                break;
        }
    }
}
