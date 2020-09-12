package com.example.android.kyotoguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Places> places = new ArrayList<>();

        places.add(new Places("the Name Place","this where the description gose","5/5",R.drawable.place_holder_image,R.drawable.shinto));
        places.add(new Places("the Name Place","this where the description gose","5/5",R.drawable.place_holder_image,R.drawable.shinto));
        places.add(new Places("the Name Place","this where the description gose","5/5",R.drawable.place_holder_image,R.drawable.shinto));
        places.add(new Places("the Name Place","this where the description gose","5/5",R.drawable.place_holder_image,R.drawable.shinto));

        PlacesAdapter placesAdapter = new  PlacesAdapter(this,places);

        ListView listView =  findViewById(R.id.list_view);

        listView.setAdapter(placesAdapter);

    }
}