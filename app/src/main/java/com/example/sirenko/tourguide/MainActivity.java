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
                startActivity(RestaurantsActivity.class);
                break;
            case R.id.tv_cat_museums:
                startActivity(MuseumsActivity.class);
                break;
            case R.id.tv_cat_cinemas:
                startActivity(CinemasActivity.class);
                break;
            case R.id.tv_cat_hospitals:
                startActivity(HospitalActivity.class);
                break;
        }
    }

    private void startActivity(Class<?> cls) {
        Intent openRest = new Intent(MainActivity.this, cls);
        startActivity(openRest);
    }
}
