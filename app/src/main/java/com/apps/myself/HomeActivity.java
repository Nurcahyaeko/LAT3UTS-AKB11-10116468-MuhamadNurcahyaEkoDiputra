package com.apps.myself;

//tanggal pengerjaan : 02-05-2019 sampai 05-05-2019
//nim   : 10116468
//nama  : Muhamad Nurcahya Eko Diputra
//kelas : AKB-11 / IF-11

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class HomeActivity extends Fragment {

    public HomeActivity(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                         Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.activity_home, container, false);

        getActivity().setTitle("Home");

        return view;

    }
}
