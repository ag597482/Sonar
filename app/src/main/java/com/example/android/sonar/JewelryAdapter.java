package com.example.android.sonar;

import android.content.Context;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class JewelryAdapter extends RecyclerView.Adapter<JewelryAdapter.JewelryViewHolder>  {

    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<Jewelry> jewelryList;

    //getting the context and product list with constructor
    public JewelryAdapter(Context mCtx, List<Jewelry> jewelryList) {
        this.mCtx = mCtx;
        this.jewelryList = jewelryList;
    }


    @NonNull
    @Override
    public JewelryAdapter.JewelryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.activity_jewelry_list, null);
        return new JewelryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JewelryAdapter.JewelryViewHolder holder, int position) {
        //getting the product of the specified position
        Jewelry jewelry = jewelryList.get(position);

        //binding the data with the viewholder views
        holder.textViewTitle.setText(jewelry.getTitle());
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(jewelry.getImage()));
    }

    @Override
    public int getItemCount() {
        return jewelryList.size();
    }
    class JewelryViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle;
        ImageView imageView;

        public JewelryViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.jewelryTitle);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
