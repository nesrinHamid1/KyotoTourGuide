package com.example.android.kyotoguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter {

    public PlacesAdapter( @NonNull Context context, ArrayList<Location> resource) {
        super(context,0,resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);

        }
        Location place = (Location) getItem(position);

        ImageView imagePlace = (ImageView) listItemView.findViewById(R.id.place_image);
        imagePlace.setImageResource(place.getPlaceImage());

        TextView NamePlace = (TextView) listItemView.findViewById(R.id.place_name);
        NamePlace.setText(place.getPlaceName());

        TextView DescriptionPlace = (TextView) listItemView.findViewById(R.id.place_description);
        DescriptionPlace.setText(place.getPlaceDescription());

        ImageView iconPlace = (ImageView) listItemView.findViewById(R.id.place_icon);
        iconPlace.setImageResource(place.getPlaceIcon());

        TextView RatingPlace = (TextView) listItemView.findViewById(R.id.place_rating);
        RatingPlace.setText(place.getPlaceRating());

        return listItemView;
    }
}
