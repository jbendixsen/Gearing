package com.westcoastcode.gearing.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.westcoastcode.gearing.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RpmFragment extends Fragment {


    public RpmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rpm, container, false);
    }


}
