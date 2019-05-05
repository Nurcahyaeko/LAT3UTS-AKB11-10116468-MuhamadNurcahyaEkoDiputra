package com.apps.myself;

//tanggal pengerjaan : 02-05-2019 sampai 05-05-2019
//nim   : 10116468
//nama  : Muhamad Nurcahya Eko Diputra
//kelas : AKB-11 / IF-11

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class ProfileActivity extends Fragment {

    public ProfileActivity(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.activity_profile, container, false);

        getActivity().setTitle("Profile");

        ImageButton btn_facebook = (ImageButton) view.findViewById(R.id.btn_facebook);
        btn_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.facebook.com/nurcahya.eko"));
                startActivity(i);
            }
        });

        ImageButton btn_twitter= (ImageButton) view.findViewById(R.id.btn_twitter);
        btn_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://twitter.com/NurcahyaRf"));
                startActivity(i);
            }
        });

        ImageButton btn_instagram = (ImageButton) view.findViewById(R.id.btn_instagram);
        btn_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.instagram.com/nurcahya.eko"));
                startActivity(i);
            }
        });

        ImageButton btn_pinterest = (ImageButton) view.findViewById(R.id.btn_pinterest);
        btn_pinterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://id.pinterest.com/nurcahyaeko/"));
                startActivity(i);
            }
        });


        Button btn_maps = (Button) view.findViewById(R.id.btn_findme);
        btn_maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.google.com/maps/place/Unnamed+Road,+Cigondewah+Kaler,+Bandung+Kulon,+Bandung+City,+West+Java+40214/@-6.9353926,107.5564327,15z/data=!3m1!4b1!4m6!3m5!1s0x2e68ef598524d5b5:0x6acfa40eaa21b0e6!7e2!8m2!3d-6.9346701!4d107.5600094"));
                startActivity(i);
            }
        });

        Button btn_dlm_about = (Button) view.findViewById(R.id.btn_about);
        btn_dlm_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AboutActivity.class);
                startActivity(i);
            }
        });

        return view;
    }
}
