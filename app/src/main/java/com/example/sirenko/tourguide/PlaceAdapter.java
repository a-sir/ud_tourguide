package com.example.sirenko.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, List<Place> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Place place = getItem(position);

        ((TextView) itemView.findViewById(R.id.name)).setText(place.name);

        ((TextView) itemView.findViewById(R.id.description)).setText(place.description);

        itemView.findViewById(R.id.place_image).setVisibility(View.GONE);
        return itemView;
    }
}
