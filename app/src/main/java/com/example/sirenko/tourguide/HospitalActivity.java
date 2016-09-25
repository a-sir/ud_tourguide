package com.example.sirenko.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HospitalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);
        List<Place> places = new ArrayList<>();
        Map<String, Integer> imageIDs = new HashMap<>();
        imageIDs.put("L'Hôpital Français de Hanoi", R.drawable.hospital_french);

        try {
            JSONObject root = new JSONObject(ResourceUtils.read(getResources().openRawResource(R.raw.data)));
            JSONArray museums = root.getJSONArray("hospitals");

            for (int i = 0 ; i < museums.length(); ++i) {
                JSONObject m = museums.getJSONObject(i);
                String name = m.getString("name");
                places.add(Place.hospital(
                        name,
                        m.getString("description"),
                        m.getString("workingHours"),
                        m.getString("address"),
                        m.getString("website"),
                        m.getString("phone"),
                        m.getString("emergencyPhone"),
                        imageIDs.containsKey(name) ? imageIDs.get(name) : -1));
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
