package com.apps.myself;

//tanggal pengerjaan : 02-05-2019 sampai 05-05-2019
//nim   : 10116468
//nama  : Muhamad Nurcahya Eko Diputra
//kelas : AKB-11 / IF-11

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FriendListActivity extends AppCompatActivity {

    private List<List_Horizontal> HorizontalList = new ArrayList<>();
    private RecyclerView horizontalRecyclerView;
    private List_Horizontal_Adapter horizontal_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_list);
        horizontalRecyclerView = findViewById(R.id.idRecyclerViewHorizontalList);
        // add a divider after each item for more clarity
        horizontalRecyclerView.addItemDecoration(new DividerItemDecoration(FriendListActivity.this, LinearLayoutManager.HORIZONTAL));
        horizontal_adapter = new List_Horizontal_Adapter(HorizontalList, getApplicationContext());
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(FriendListActivity.this, LinearLayoutManager.HORIZONTAL, false);
        horizontalRecyclerView.setLayoutManager(horizontalLayoutManager);
        horizontalRecyclerView.setAdapter(horizontal_adapter);
        populateHorizontalList();
    }
    private void populateHorizontalList(){
        List_Horizontal gerdi = new List_Horizontal(R.drawable.friend_gerdi, "Gerdi Abdi Salam");
        List_Horizontal jordi = new List_Horizontal(R.drawable.friend_jordi, "Adam Jordi");
        List_Horizontal iqbal = new List_Horizontal(R.drawable.friend_iqbal, "Iqbal Shorfana");
        List_Horizontal faldi = new List_Horizontal(R.drawable.friend_faldi, "Faldi Falvian");
        HorizontalList.add(gerdi);
        HorizontalList.add(jordi);
        HorizontalList.add(iqbal);
        HorizontalList.add(faldi);
        horizontal_adapter.notifyDataSetChanged();

    }
}
