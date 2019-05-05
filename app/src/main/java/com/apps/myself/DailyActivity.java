package com.apps.myself;

//tanggal pengerjaan : 02-05-2019 sampai 05-05-2019
//nim   : 10116468
//nama  : Muhamad Nurcahya Eko Diputra
//kelas : AKB-11 / IF-11

import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class DailyActivity extends Fragment {

    public DailyActivity(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.activity_daily, container, false);

        getActivity().setTitle("Daily");



        Button btn_sh_dialy = (Button) view.findViewById(R.id.btn_sh_daily);
        btn_sh_dialy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DailyActivity2.class);
                startActivity(i);
            }
        });

        Button btn_sh_friend = (Button) view.findViewById(R.id.btn_sh_friend);
        btn_sh_friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), FriendListActivity.class);
                startActivity(i);
            }
        });

        return view;
    }
}
