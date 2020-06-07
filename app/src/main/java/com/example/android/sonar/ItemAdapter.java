package com.example.android.sonar;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    private  int col;
    public ItemAdapter(Activity context, ArrayList<Item> items, int c)
    {
        super(context,0,items);
        col=c;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

//        View listItemView = convertView;
//        if(listItemView == null) {
//            listItemView = LayoutInflater.from(getContext()).inflate(
//                    R.layout.detailed_list_item, parent, false);
//        }
//
//        Item cw = getItem(position);
//
//        TextView mw = (TextView) listItemView.findViewById(R.id.miwok);
//        mw.setText(cw.getM());
//
//        TextView ew = (TextView) listItemView.findViewById(R.id.eng);
//        ew.setText(cw.getE());
//
//
//        ImageView iw = (ImageView) listItemView.findViewById(R.id.im);
//
//        if(cw.hasImage()) {
//            iw.setImageResource(cw.getI());
//            iw.setVisibility(View.VISIBLE);
//        }
//        else
//        {
//            iw.setVisibility(View.GONE);
//        }
//        View tc = listItemView.findViewById(R.id.textc);
//
//        int cl= ContextCompat.getColor(getContext(),col);
//        tc.setBackgroundColor(cl);
//
//        return listItemView;
    }
}
