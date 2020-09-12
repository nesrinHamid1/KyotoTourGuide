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

        ArrayList<Places> places = new ArrayList<>();

        places.add(new Places("the Name Place","this where the description gose","5/5",R.drawable.place_holder_image,R.drawable.confetti));
        places.add(new Places("the Name Place","this where the description gose","5/5",R.drawable.place_holder_image,R.drawable.confetti));
        places.add(new Places("the Name Place","this where the description gose","5/5",R.drawable.place_holder_image,R.drawable.confetti));
        places.add(new Places("the Name Place","this where the description gose","5/5",R.drawable.place_holder_image,R.drawable.confetti));

        PlacesAdapter placesAdapter = new  PlacesAdapter(Objects.requireNonNull(getActivity()),places);

        ListView listView =  rootView.findViewById(R.id.list_view);

        listView.setAdapter(placesAdapter);


        return rootView;
    }
}