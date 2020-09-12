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


public class historicalSiteFragment extends Fragment {

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

        places.add(new Location("Ginkakuji Temple","Ginkakuji (Silver Pavilion) is a Zen temple along Kyoto's eastern mountains (Higashiyama).","4.1/5",R.drawable.ginkakuji,R.drawable.shinto));
        places.add(new Location("Kiyomizudera Temple","Kiyomizudera (literally \"Pure Water Temple\") is one of the most celebrated temples of Japan.","4.6/5",R.drawable.kiyomizudera_temple,R.drawable.shinto));
        places.add(new Location("Daigoji Temple","Daigoji is an important temple of the Shingon sect of Japanese Buddhism and a designated world heritage site.","4/5",R.drawable.daigoji_temple,R.drawable.shinto));
        places.add(new Location("Tofukuji Temple","Tofukuji (東福寺, Tōfukuji) is a large Zen temple in southeastern Kyoto that is particularly famous for its spectacular autumn colors. ","3.9/5",R.drawable.tofukuji_temple,R.drawable.shinto));

        PlacesAdapter placesAdapter = new  PlacesAdapter(Objects.requireNonNull(getActivity()),places);

        ListView listView =  rootView.findViewById(R.id.list_view);

        listView.setAdapter(placesAdapter);


        return rootView;
    }
}