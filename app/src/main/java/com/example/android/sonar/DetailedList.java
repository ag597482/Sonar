package com.example.android.sonar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DetailedList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_list);

        ArrayList<Item> num=new ArrayList<Item>();
        num=(ArrayList<Item>) getIntent().getSerializableExtra("nume");



        //LinearLayout linearLayout=(LinearLayout)findViewById(R.id.root);

        ItemAdapter itemsAdapter = new ItemAdapter(this,num,R.color.colorAccent);


        ListView listView = (ListView) findViewById(R.id.detail_list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                //shalini babua add your code here   1 add a new activity
            }
        });
    }
}
