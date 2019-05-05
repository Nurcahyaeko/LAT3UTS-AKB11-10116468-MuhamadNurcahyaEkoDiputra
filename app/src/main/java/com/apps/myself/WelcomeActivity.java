package com.apps.myself;

//tanggal pengerjaan : 02-05-2019 sampai 05-05-2019
//nim   : 10116468
//nama  : Muhamad Nurcahya Eko Diputra
//kelas : AKB-11 / IF-11

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WelcomeActivity extends Fragment {

    public WelcomeActivity(){}
    View welcomeActivityView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            welcomeActivityView = inflater.inflate(R.layout.activity_welcome, container, false);

        return welcomeActivityView;


    }
}
