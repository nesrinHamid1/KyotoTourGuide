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

public class ParksFragment extends Fragment {

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

        places.add(new Location("Sento Imperial Palace","Sento Imperial Palace is a secondary palace complex across from the Kyoto Imperial Palace in Kyoto Imperial Park.","3.8/5",R.drawable.sento_imperial_palace,R.drawable.sakura));
        places.add(new Location("Shugakuin Imperial Villa","Shugakuin Imperial Villa was built in the 17th century by Emperor Gomizuno and is now managed by the Imperial Household Agency.","4.2/5",R.drawable.shugakuin_imperial_villa,R.drawable.sakura));
        places.add(new Location("Toei Uzumasa Eigamura","The Toei Uzumasa Eigamura (also known as Kyoto Studio Park or Movie Land.) is a film set and theme park in one.","3.6/5",R.drawable.toei_uzumasa_eigamura,R.drawable.sakura));
        places.add(new Location("Katsura Imperial Villa","Katsura Imperial Villa is one of the finest examples of Japanese architecture and garden design.","4.1/5",R.drawable.katsura_imperial_villa,R.drawable.sakura));

        PlacesAdapter placesAdapter = new  PlacesAdapter(Objects.requireNonNull(getActivity()),places);

        ListView listView =  rootView.findViewById(R.id.list_view);

        listView.setAdapter(placesAdapter);


        return rootView;
    }
}