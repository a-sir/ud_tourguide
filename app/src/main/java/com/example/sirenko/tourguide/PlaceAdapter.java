package com.example.sirenko.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

class PlaceAdapter extends ArrayAdapter<Place> {

    PlaceAdapter(Context context, List<Place> objects) {
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

        TextView desc = (TextView) itemView.findViewById(R.id.tv_place_description);
        if (place.description != null && !place.description.isEmpty()) {
            desc.setText(place.description);
            desc.setVisibility(View.VISIBLE);
        } else {
            desc.setVisibility(View.GONE);
        }

        ((TextView) itemView.findViewById(R.id.tv_place_working_hours)).setText("Working hours: " + place.workingHours);

        TextView bill = (TextView) itemView.findViewById(R.id.tv_place_average_bill_dollars);
        if (place.averageBillVND != -1) {
            bill.setText("Average bill: $" + String.valueOf(place.averageBillVND));
            bill.setVisibility(View.VISIBLE);
        } else {
            bill.setVisibility(View.GONE);
        }

        ((TextView) itemView.findViewById(R.id.tv_place_address)).setText("Address: " + place.address);
        ((TextView) itemView.findViewById(R.id.tv_place_website)).setText("www: " + place.website);
        ((TextView) itemView.findViewById(R.id.tv_place_phone)).setText("Phone: " + place.phone);
        TextView emergency = (TextView) itemView.findViewById(R.id.tv_place_emergency_phone);
        if (place.emergencyPhone != null) {
            ((TextView) itemView.findViewById(R.id.tv_place_emergency_phone)).setText("Emergency: " + place.emergencyPhone);
            emergency.setVisibility(View.VISIBLE);
        } else {
            emergency.setVisibility(View.GONE);
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
