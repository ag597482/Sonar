package com.example.android.sonar.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.android.sonar.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);


        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("mana");
        arrayList.add("mana");
        arrayList.add("mana");
        arrayList.add("mana");
        arrayList.add("mana");
        arrayList.add("mana");
        arrayList.add("mana");
        arrayList.add("mana");
        arrayList.add("mana");
        arrayList.add("mana");
        arrayList.add("mana");
        arrayList.add("mana");
        arrayList.add("mana");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,arrayList);
        GridView gridView = root.findViewById(R.id.mainlist);



        gridView.setAdapter(adapter);

//        final TextView textView = root.findViewById(R.id.text_home);
//
//        textView.setText("Home Aman");
        return root;
    }
}
