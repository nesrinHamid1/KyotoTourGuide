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

        places.add(new Location(getString(R.string.Kaiseki_Ryori), getString(R.string.description_Kaiseki_Ryori), "4.1/5", R.drawable.kaiseki_ryori, R.drawable.rice));
        places.add(new Location(getString(R.string.Shojin_Ryori), getString(R.string.description_shojin_Ryori), "3.6/5", R.drawable.shojin_ryori, R.drawable.rice));
        places.add(new Location(getString(R.string.Obanzai_Ryori), getString(R.string.description_Obanzai_Ryori), "4.9/5", R.drawable.obanzai_ryori, R.drawable.rice));
        places.add(new Location(getString(R.string.Kawayuka), getString(R.string.description_Kawayuka), "4.5/5", R.drawable.kawayuka, R.drawable.rice));

        PlacesAdapter placesAdapter = new PlacesAdapter(Objects.requireNonNull(getActivity()), places);

        ListView listView =rootView.findViewById(R.id.list_view);

        listView.setAdapter(placesAdapter);

        return rootView;
    }
}