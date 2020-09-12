package com.example.android.kyotoguide;

public class Places {
    private String mPlaceName;
    private String mPlaceDescription;
    private String mPlaceRating;
    private int mPlaceImage;
    private int mPlaceIcon;

    public Places(String placeName, String placeDescription, String placeRating,int placeImage,int placeIcon ){
        mPlaceName = placeName;
        mPlaceDescription = placeDescription;
        mPlaceRating = placeRating;
        mPlaceImage = placeImage;
        mPlaceIcon = placeIcon;
    }

    public String getPlaceName(){
        return mPlaceName;
    }

    public String getPlaceDescription(){
        return mPlaceDescription;
    }

    public String getPlaceRating(){
        return mPlaceRating;
    }

    public  int getPlaceImage(){
        return mPlaceImage;
    }

    public  int getPlaceIcon(){
        return mPlaceIcon;
    }
}
