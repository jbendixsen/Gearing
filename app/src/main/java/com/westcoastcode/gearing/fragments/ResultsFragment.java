package com.westcoastcode.gearing.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.westcoastcode.gearing.R;
import com.westcoastcode.gearing.SpeedsAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResultsFragment extends Fragment implements SpeedsAdapter.SpeedAdapterListener {

    private static final String TAG = "ResultsFragment";

    private RecyclerView mRecyclerView;
    private SpeedsAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private resultListener mListener;

    public void setListener(resultListener listener){
        mListener = listener;
    }


    public ResultsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_results, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.resultsList);

        mAdapter = new SpeedsAdapter();
        mAdapter.setListener(this);
        mLayoutManager = new LinearLayoutManager(this.getActivity());

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }

    @Override
    public double calcSpeed(double ratio, int gear) {
        return mListener.calcSpeed(ratio, gear);
    }

    public interface resultListener{
        double calcSpeed(double ratio, int gear);
    }

}
