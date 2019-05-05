package com.apps.myself;

//tanggal pengerjaan : 02-05-2019 sampai 05-05-2019
//nim   : 10116468
//nama  : Muhamad Nurcahya Eko Diputra
//kelas : AKB-11 / IF-11

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class List_Horizontal_Adapter extends RecyclerView.Adapter<List_Horizontal_Adapter.HorizontalViewHolder>{
    private List<List_Horizontal> horizontalsList_Horizontal;
    Context context;

    public List_Horizontal_Adapter(List<List_Horizontal> horizontalsList_Horizontal, Context context) {
        this.horizontalsList_Horizontal = horizontalsList_Horizontal;
        this.context = context;
    }

    @Override
    public HorizontalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the layout file
        View horizontalProductView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_view_horizontal, parent, false);
        HorizontalViewHolder hvh = new HorizontalViewHolder(horizontalProductView);
        return hvh;
    }

    @Override
    public void onBindViewHolder(HorizontalViewHolder holder, final int position) {
        holder.imageView.setImageResource(horizontalsList_Horizontal.get(position).getFriandImage());
        holder.txtview.setText(horizontalsList_Horizontal.get(position).getFriendName());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String friendName = horizontalsList_Horizontal.get(position).getFriendName().toString();
                Toast.makeText(context, friendName + " is selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return horizontalsList_Horizontal.size();
    }

    public class HorizontalViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView txtview;

        public HorizontalViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.friendImage);
            txtview = view.findViewById(R.id.friendName);
        }
    }
}
