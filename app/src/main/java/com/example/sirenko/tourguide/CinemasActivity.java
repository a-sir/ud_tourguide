package com.example.sirenko.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CinemasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);
        List<Place> places = new ArrayList<>();
        try {
            JSONObject root = new JSONObject(ResourceUtils.read(getResources().openRawResource(R.raw.data)));
            JSONArray museums = root.getJSONArray("cinemas");
            for (int i = 0 ; i < museums.length(); ++i) {
                JSONObject m = museums.getJSONObject(i);
                places.add(Place.cinema(
                        m.getString("name"),
                        m.getString("workingHours"),
                        m.getString("address"),
                        m.getString("website"),
                        m.getString("phone")));
            }
        } catch (JSONException | IOException e) {
            throw new RuntimeException(e);
        }
        PlaceAdapter adapter = new PlaceAdapter(this, places);
        ListView layout = (ListView) findViewById(R.id.places_list_id);
        assert layout != null;
        layout.setAdapter(adapter);
    }
}
