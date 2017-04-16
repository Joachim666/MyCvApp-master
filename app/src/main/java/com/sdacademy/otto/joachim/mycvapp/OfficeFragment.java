package com.sdacademy.otto.joachim.mycvapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jojo on 16.04.2017.
 */

public class OfficeFragment extends DialogFragment {

    public OfficeFragment(){

    }

    public static OfficeFragment newInstance() {


        OfficeFragment officeFragment = new OfficeFragment();

        return officeFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.office_fragment,container,false);
        return view;
    }
}
