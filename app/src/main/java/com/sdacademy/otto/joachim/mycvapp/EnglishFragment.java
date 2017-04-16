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

public class EnglishFragment extends DialogFragment {

    public EnglishFragment(){

    }

    public static EnglishFragment newInstance() {

        EnglishFragment englishFragment = new EnglishFragment();


        return englishFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.english_fragment,container,false);
        return view;
    }
}
