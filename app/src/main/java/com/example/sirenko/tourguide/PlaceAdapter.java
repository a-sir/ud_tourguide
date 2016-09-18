package com.example.sirenko.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
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

        ((TextView) itemView.findViewById(R.id.tv_place_name)).setText(place.name);
        ((TextView) itemView.findViewById(R.id.tv_place_description)).setText(place.description);
        ((TextView) itemView.findViewById(R.id.tv_place_working_hours)).setText("Working hours: " + place.workingHours);
        if (place.averageBillDollars != -1) {
            ((TextView) itemView.findViewById(R.id.tv_place_average_bill_dollars)).setText("Average bill: $" + String.valueOf(place.averageBillDollars));
        }
        ((TextView) itemView.findViewById(R.id.tv_place_address)).setText("Address: " + place.address);
        ((TextView) itemView.findViewById(R.id.tv_place_website)).setText("www: " + place.website);
        ((TextView) itemView.findViewById(R.id.tv_place_phone)).setText("Phone: " + place.phone);
        if (place.emergencyPhone != null) {
            ((TextView) itemView.findViewById(R.id.tv_place_emergency_phone)).setText("Emergency: " + place.emergencyPhone);
        }

        ImageView image = (ImageView) itemView.findViewById(R.id.iv_place_image);
        if (place.imageResourceId == -1) {
            image.setVisibility(View.GONE);
        } else {
            image.setImageResource(place.imageResourceId);
            image.setVisibility(View.VISIBLE);
        }
        return itemView;
    }
}
