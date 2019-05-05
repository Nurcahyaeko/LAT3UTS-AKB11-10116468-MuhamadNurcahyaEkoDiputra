package com.apps.myself;

//tanggal pengerjaan : 02-05-2019 sampai 05-05-2019
//nim   : 10116468
//nama  : Muhamad Nurcahya Eko Diputra
//kelas : AKB-11 / IF-11

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DailyAdapter extends RecyclerView.Adapter<DailyAdapter.dailyViewHolder>{

    private Context mCtx;
    private List<Daily>  dailyList;

    public DailyAdapter(Context mCtx, List<Daily> dailyList) {
        this.mCtx = mCtx;
        this.dailyList = dailyList;
    }

    @NonNull
    @Override
    public dailyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout, null);
        return new dailyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull dailyViewHolder dailyViewHolder, int i) {
        Daily daily = dailyList.get(i);

        dailyViewHolder.textViewTitle.setText(daily.getKerja());
        dailyViewHolder.imageView.setImageDrawable(mCtx.getResources().getDrawable(daily.getGambar()));

    }

    @Override
    public int getItemCount() {
        return dailyList.size();
    }

    class dailyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewTitle;

        public dailyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
        }
    }

}
