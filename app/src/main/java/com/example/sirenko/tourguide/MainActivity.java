package com.example.sirenko.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
            case R.id.tv_cat_museums:
            case R.id.tv_cat_cinemas:
            case R.id.tv_cat_hospitals:
            default:
                break;
        }
    }
}
