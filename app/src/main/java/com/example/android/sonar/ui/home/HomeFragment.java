package com.example.android.sonar.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.android.sonar.DetailedList;
import com.example.android.sonar.Item;
import com.example.android.sonar.ItemList;
import com.example.android.sonar.Jewelry;
import com.example.android.sonar.JewelryAdapter;
import com.example.android.sonar.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {



    public View onCreateView(@NonNull final LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        ArrayList<Jewelry> jeweleryList= new ArrayList<Jewelry>();


        jeweleryList.add(new Jewelry(1, "Necklace", R.drawable.ic_launcher_background));
        jeweleryList.add(new Jewelry(2, "Ring", R.drawable.ic_launcher_background));
        jeweleryList.add(new Jewelry(3, "Bangles", R.drawable.ic_launcher_background));
        jeweleryList.add(new Jewelry(4, "Chain", R.drawable.ic_launcher_background));

        jeweleryList.add(new Jewelry(1, "Necklace", R.drawable.ic_launcher_background));
        jeweleryList.add(new Jewelry(2, "Ring", R.drawable.ic_launcher_background));
        jeweleryList.add(new Jewelry(3, "Bangles", R.drawable.ic_launcher_background));
        jeweleryList.add(new Jewelry(4, "Chain", R.drawable.ic_launcher_background));
        jeweleryList.add(new Jewelry(1, "Necklace", R.drawable.ic_launcher_background));
        jeweleryList.add(new Jewelry(2, "Ring", R.drawable.ic_launcher_background));
        jeweleryList.add(new Jewelry(3, "Bangles", R.drawable.ic_launcher_background));
        jeweleryList.add(new Jewelry(4, "Chain", R.drawable.ic_launcher_background));

        JewelryAdapter jewelryAdapter = new JewelryAdapter(getContext(),jeweleryList);


        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,arrayList);
        GridView gridView = root.findViewById(R.id.mainlist);


        gridView.setAdapter(jewelryAdapter);



//        final TextView textView = root.findViewById(R.id.text_home);
//
//        textView.setText("Home Aman");

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {





                Intent i=new Intent(getContext(), DetailedList.class);
                ArrayList<Item> num= new ArrayList<Item>();

                num.add(new Item("lutti "+ position,"one" + position,R.drawable.ic_menu_camera));
                num.add(new Item("tlutti","tone"+ position,R.drawable.ic_menu_camera));
                num.add(new Item("lutti","one",R.drawable.ic_menu_camera));

                num.add(new Item("tlutti","tone",R.drawable.ic_menu_camera));
                num.add(new Item("lutti","one",R.drawable.ic_menu_camera));
                num.add(new Item("tlutti","tone",R.drawable.ic_menu_camera));
                num.add(new Item("lutti","one",R.drawable.ic_menu_camera));
                num.add(new Item("tlutti","tone",R.drawable.ic_menu_camera));
                num.add(new Item("lutti"+ position,"one"+ position,R.drawable.ic_menu_camera));

                i.putExtra("nume",num);
                startActivity(i);
                //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                   //     new ItemList()).commit();

            }
        });
        return root;
    }



}
