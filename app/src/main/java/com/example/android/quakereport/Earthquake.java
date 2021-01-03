package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeinMS;
    private  String mUrl;


    public Earthquake(double mMagnitude, String mLocation, long mTimeinMS,String mUrl) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeinMS = mTimeinMS;
        this.mUrl = mUrl;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmTimeinMS() {
        return mTimeinMS;
    }

    public String getmUrl(){return mUrl;}
}
