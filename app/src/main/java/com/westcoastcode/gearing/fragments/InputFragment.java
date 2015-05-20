package com.westcoastcode.gearing.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.westcoastcode.gearing.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class InputFragment extends Fragment {

    private static final String TAG = "InputFragment";

    public InputFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_input, container, false);

        EditText editRpm = (EditText) view.findViewById(R.id.editRpm);
        editRpm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Log.d(TAG, "editRpm beforeTextChanged");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Log.d(TAG, "editRpm onTextChanged");
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Log.d(TAG, "editRpm afterTextChanged");
            }
        });

        EditText editTireCircumference = (EditText) view.findViewById(R.id.editTireCircumference);
        editTireCircumference.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Log.d(TAG, "editTireCircumference beforeTextChanged");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Log.d(TAG, "editTireCircumference onTextChanged");
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Log.d(TAG, "editTireCircumference afterTextChanged");
            }
        });

        EditText editTransmission = (EditText) view.findViewById(R.id.editTransmission);
        editTransmission.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Log.d(TAG, "editTransmission beforeTextChanged");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Log.d(TAG, "editTransmission onTextChanged");
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Log.d(TAG, "editTransmission afterTextChanged");
            }
        });

        return view;
    }

}
