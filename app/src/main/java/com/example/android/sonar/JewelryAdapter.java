package com.example.android.sonar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class JewelryAdapter extends ArrayAdapter<Jewelry> {


    public JewelryAdapter(@NonNull Context context, List<Jewelry> jewelryList) {

        super(context,0, jewelryList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Jewelry cw = getItem(position);

        TextView mw = (TextView) listItemView.findViewById(R.id.jewelryTitle);
        mw.setText(cw.getTitle());



        ImageView iw = (ImageView) listItemView.findViewById(R.id.imageView);

        iw.setImageResource(cw.getImage());



        return listItemView;
    }

    //    @NonNull
//    @Override
//    public JewelryAdapter.JewelryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater inflater = LayoutInflater.from(mCtx);
//        View view = inflater.inflate(R.layout.activity_jewelry_list, null);
//        return new JewelryViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull JewelryAdapter.JewelryViewHolder holder, int position) {
//        //getting the product of the specified position
//        Jewelry jewelry = jewelryList.get(position);
//
//        //binding the data with the viewholder views
//        holder.textViewTitle.setText(jewelry.getTitle());
//        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(jewelry.getImage()));
//    }
//
//    @Override
//    public int getItemCount() {
//        return jewelryList.size();
//    }
//    class JewelryViewHolder extends RecyclerView.ViewHolder {
//
//        TextView textViewTitle;
//        ImageView imageView;
//
//        public JewelryViewHolder(View itemView) {
//            super(itemView);
//
//            textViewTitle = itemView.findViewById(R.id.jewelryTitle);
//            imageView = itemView.findViewById(R.id.imageView);
//        }
//    }
}
