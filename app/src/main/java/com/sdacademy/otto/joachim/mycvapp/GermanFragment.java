package com.sdacademy.otto.joachim.mycvapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jojo on 16.04.2017.
 */

public class GermanFragment extends DialogFragment {

    public GermanFragment(){

    }

    public static GermanFragment newInstance() {



        GermanFragment germanFragment = new GermanFragment();

        return germanFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.german_fragment,container,false);
        return view;
    }
}
