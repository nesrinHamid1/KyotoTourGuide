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

        places.add(new Location("Gion Matsuri","the festival of Yasaka Shrine, is the most famous festival in Japan. It takes place over the entire month of July.","4.3/5",R.drawable.gion_matsuri,R.drawable.confetti));
        places.add(new Location("Hanatoro","\"flower and light road\", is a set of illumination events that take place in the Higashiyama District of Kyoto in March and the Arashiyama district of Kyoto in December.","4.1/5",R.drawable.hanatoro,R.drawable.confetti));
        places.add(new Location("Aoi Matsuri","Aoi Matsuri takes place every May 15. The festival's main attraction is a large parade in Kyoto, in which over 500 people dressed in the aristocratic style of the Heian Period (794-1185) walk from the Imperial Palace to the Kamo Shrines.","3.9/5",R.drawable.aoi_matsuri,R.drawable.confetti));
        places.add(new Location("Jidai Matsuri","The Jidai Matsuri is a festival that takes place every year on October 22, the anniversary of the foundation of Kyoto. It consists of a large parade that travels from the Imperial Palace to Heian Shrine","3.7/5",R.drawable.jidai_matsuri,R.drawable.confetti));

        PlacesAdapter placesAdapter = new  PlacesAdapter(Objects.requireNonNull(getActivity()),places);

        ListView listView =  rootView.findViewById(R.id.list_view);

        listView.setAdapter(placesAdapter);


        return rootView;
    }
}