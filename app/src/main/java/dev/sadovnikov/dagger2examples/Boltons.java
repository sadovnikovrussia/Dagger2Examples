package dev.sadovnikov.dagger2examples;

import android.util.Log;

import javax.inject.Inject;

public class Boltons implements House {
    private static final String TAG = "Boltons";

    @Inject
    public Boltons() {
    }

    @Override
    public void prepareForBattle() {
        Log.d(TAG, "prepareForBattle: ");
    }

    @Override
    public void reportForBattle() {
        Log.d(TAG, "reportForBattle: ");
    }
}
