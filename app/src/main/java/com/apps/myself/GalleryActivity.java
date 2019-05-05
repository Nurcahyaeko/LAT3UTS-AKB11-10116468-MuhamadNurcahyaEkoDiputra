package com.apps.myself;

//tanggal pengerjaan : 02-05-2019 sampai 05-05-2019
//nim   : 10116468
//nama  : Muhamad Nurcahya Eko Diputra
//kelas : AKB-11 / IF-11

import android.app.Fragment;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class GalleryActivity extends Fragment {

    public GalleryActivity(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.activity_gallery, container, false);

        getActivity().setTitle("Tools");

        return view;
    }
}
