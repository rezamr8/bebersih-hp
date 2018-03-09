package com.e74Studio.mobileoptimizer.freeboostercleaner.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.e74Studio.mobileoptimizer.freeboostercleaner.base.FragmentContainerActivity;


public class SettingsFragment extends PreferenceFragment {


    public static void launch(Activity from) {
        FragmentContainerActivity.launch(from, SettingsFragment.class, null);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }



}
