package com.apps.myself;

//tanggal pengerjaan : 02-05-2019 sampai 05-05-2019
//nim   : 10116468
//nama  : Muhamad Nurcahya Eko Diputra
//kelas : AKB-11 / IF-11

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DailyActivity2 extends AppCompatActivity {

    RecyclerView recyclerView;
    DailyAdapter adapter;
    List<Daily> dailyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily2);

        dailyList= new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.daily_act);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dailyList.add(
                new Daily(
                        "Pukul 03.44 - 04.30 Bangun",
                        R.drawable.icons_calendar));
        dailyList.add(
                new Daily(
                        "Pukul 04.31 - 05.00 Sholat",
                        R.drawable.icons_calendar));
        dailyList.add(
                new Daily(
                        "Pukul 05.01 - 06.00 Free",
                        R.drawable.icons_calendar));
        dailyList.add(
                new Daily(
                        "Pukul 06.01 - 07.30 Sarapan",
                        R.drawable.icons_calendar));
        dailyList.add(
                new Daily(
                        "Pukul 07.31 - 11.30 Aktifitas Bebas",
                        R.drawable.icons_calendar));
        dailyList.add(
                new Daily(
                        "Pukul 11.31 - 12.15 Sholat Dzuhur",
                        R.drawable.icons_calendar));
        dailyList.add(
                new Daily(
                        "Pukul 12.16 - 13.00 Makan Siang",
                        R.drawable.icons_calendar));
        dailyList.add(
                new Daily(
                        "Pukul 13.01 - 15.00 Aktifitas Bebas",
                        R.drawable.icons_calendar));

        dailyList.add(
                new Daily(
                        "Pukul 15.01 - 15.30 Sholat Ashar",
                        R.drawable.icons_calendar));
        dailyList.add(
                new Daily(
                        "Pukul 15.31 - 17.30 Aktifitas Bebas",
                        R.drawable.icons_calendar));
        dailyList.add(
                new Daily(
                        "Pukul 17.31 - 18.30 Sholat Magrib",
                        R.drawable.icons_calendar));
        dailyList.add(
                new Daily(
                        "Pukul 18.31 - 19.00 Makan Malam",
                        R.drawable.icons_calendar));
        dailyList.add(
                new Daily(
                        "Pukul 19.01 - 19.45 Sholat Isya",
                        R.drawable.icons_calendar));
        dailyList.add(
                new Daily(
                        "Pukul 19.46 - 21.30 Aktifitas Bebas",
                        R.drawable.icons_calendar));
        dailyList.add(
                new Daily(
                        "Pukul 21.30 - 03.45 Istirahat",
                        R.drawable.icons_calendar));


        adapter = new DailyAdapter(this, dailyList);
        recyclerView.setAdapter(adapter);
    }
}
