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

public class FestivalsFragment extends Fragment {


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

        places.add(new Location(getString(R.string.Gion_Matsuri),getString(R.string.description_Gion_Matsuri),"4.3/5",R.drawable.gion_matsuri,R.drawable.confetti));
        places.add(new Location(getString(R.string.Hanatoro),getString(R.string.description_Hanatoro),"4.1/5",R.drawable.hanatoro,R.drawable.confetti));
        places.add(new Location(getString(R.string.Aoi_Matsuri),getString(R.string.description_Aoi_Matsuri),"3.9/5",R.drawable.aoi_matsuri,R.drawable.confetti));
        places.add(new Location(getString(R.string.Jidai_Matsuri),getString(R.string.description_Jidai_Matsuri),"3.7/5",R.drawable.jidai_matsuri,R.drawable.confetti));

        PlacesAdapter placesAdapter = new  PlacesAdapter(Objects.requireNonNull(getActivity()),places);

        ListView listView =  rootView.findViewById(R.id.list_view);

        listView.setAdapter(placesAdapter);


        return rootView;
    }
}