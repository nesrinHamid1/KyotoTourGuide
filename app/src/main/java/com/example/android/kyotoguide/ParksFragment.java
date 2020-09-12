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

        places.add(new Location(getString(R.string.Sento_Imperial_Palace), getString(R.string.description_Sento_Imperial_Palace), "3.8/5", R.drawable.sento_imperial_palace, R.drawable.sakura));
        places.add(new Location(getString(R.string.Shugakuin_Imperial_Villa), getString(R.string.description_Shugakuin_Imperial_Villa), "4.2/5", R.drawable.shugakuin_imperial_villa, R.drawable.sakura));
        places.add(new Location(getString(R.string.Toei_Uzumasa_Eigamura), getString(R.string.description_Toei_Uzumasa_Eigamura), "3.6/5", R.drawable.toei_uzumasa_eigamura, R.drawable.sakura));
        places.add(new Location(getString(R.string.Katsura_Imperial_Villa), getString(R.string.description_Katsura_Imperial_Villa), "4.1/5", R.drawable.katsura_imperial_villa, R.drawable.sakura));

        PlacesAdapter placesAdapter = new PlacesAdapter(Objects.requireNonNull(getActivity()), places);

        ListView listView = rootView.findViewById(R.id.list_view);

        listView.setAdapter(placesAdapter);

        return rootView;
    }
}