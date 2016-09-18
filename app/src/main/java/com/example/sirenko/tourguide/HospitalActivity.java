package com.example.sirenko.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HospitalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);
        List<Place> places = new ArrayList<>();

        places.add(Place.hospital("Platinum cineplex Royal City", "The best cinema in Hanoi", "Every day 9-22", "Hanoi, Giang Vo, 161", "www.singapore-food-hanoi.com.vn", "+848762378675", "+848762378675", R.drawable.hospital_french));
        places.add(Place.hospital("CGV in Mipec Tower", "New Hollywood movies", "Every day 9-22", "Hanoi, Giang Vo, 161", "www.singapore-food-hanoi.com.vn", "+848762378675", "+848762378675", R.drawable.hospital_french));
        places.add(Place.hospital("Old cinema on Lang Ha", "Low prices", "Every day 9-22", "Hanoi, Giang Vo, 161", "www.singapore-food-hanoi.com.vn", "+848762378675", "+848762378675", R.drawable.hospital_french));
        places.add(Place.hospital("CGV Vincom center", "In city center", "Every day 9-22", "Hanoi, Giang Vo, 161", "www.singapore-food-hanoi.com.vn", "+848762378675", "+848762378675", R.drawable.hospital_french));
        PlaceAdapter adapter = new PlaceAdapter(this, places);
        ListView layout = (ListView) findViewById(R.id.places_list_id);
        assert layout != null;
        layout.setAdapter(adapter);
    }
}
