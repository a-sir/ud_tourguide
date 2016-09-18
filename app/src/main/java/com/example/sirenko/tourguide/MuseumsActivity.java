package com.example.sirenko.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);
        List<Place> places = new ArrayList<>();
        places.add(Place.museum("Ethnographic museum", "Old pictures and houses", "Every day 9-22", "Hanoi, Giang Vo, 161", "www.singapore-food-hanoi.com.vn", "+848762378675"));
        places.add(Place.museum("Army museum", "Tanks and airplanes", "Every day 9-22", "Hanoi, Giang Vo, 161", "www.singapore-food-hanoi.com.vn", "+848762378675"));
        places.add(Place.museum("Internet museum", "About pokemons and coccoc", "Every day 9-22", "Hanoi, Giang Vo, 161", "www.singapore-food-hanoi.com.vn", "+848762378675"));
        places.add(Place.museum("Boring museum", "History of history", "Every day 9-22", "Hanoi, Giang Vo, 161", "www.singapore-food-hanoi.com.vn", "+848762378675"));
        PlaceAdapter adapter = new PlaceAdapter(this, places);
        ListView layout = (ListView) findViewById(R.id.places_list_id);
        assert layout != null;
        layout.setAdapter(adapter);
    }
}
