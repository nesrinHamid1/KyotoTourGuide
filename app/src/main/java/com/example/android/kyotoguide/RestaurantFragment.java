package com.example.android.kyotoguide;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Objects;

public class RestaurantFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.plases_list, container, false);

        ArrayList<Location> places = new ArrayList<>();

        places.add(new Location("Kaiseki Ryori","Kaiseki ryori has its origin in the traditional tea ceremony, but later evolved into an elaborate dining style popular among aristocratic circles.","4.1/5",R.drawable.kaiseki_ryori,R.drawable.rice));
        places.add(new Location("Shojin Ryori","Whereas kaiseki developed out of the affluence of the aristocrats, shojin ryori developed from the austerity of Buddhist monks.","3.6/5",R.drawable.shojin_ryori,R.drawable.rice));
        places.add(new Location("Obanzai Ryori","Obanzai Ryori is the traditional home style cooking of Kyoto. It is made up of multiple small dishes that are usually quite simple to prepare.","4.9/5",R.drawable.obanzai_ryori,R.drawable.rice));
        places.add(new Location("Kawayuka","Kawayuka, or Kawadoko as it is known outside of central Kyoto, is the summer pasttime of dining outdoors on temporary platforms built over flowing water. ","4.5/5",R.drawable.kawayuka,R.drawable.rice));

        PlacesAdapter placesAdapter = new  PlacesAdapter(Objects.requireNonNull(getActivity()),places);

        ListView listView =  rootView.findViewById(R.id.list_view);

        listView.setAdapter(placesAdapter);


        return rootView;
    }
}