package com.example.krishan.travels;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Parkfrag extends Fragment {


    String arr[] = {"Mughal Garden","Deer Park","Lodhi Garden","Naitional Zoo","Nehru Park"} ;
    Integer imageId[] ={R.drawable.mughalg,R.drawable.deerpark,R.drawable.lodhi,R.drawable.zoo2,R.drawable.nehruprk};

    public Parkfrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_parkfrag, container, false);
        Myadapter apapter = new Myadapter(getActivity());
        ListView listView = v.findViewById(R.id.paark_l);
        listView.setAdapter(apapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent i = new Intent(getActivity(),Mughal_garden.class);
                    startActivity(i);
                }
                else if(position==1){
                    Intent i = new Intent(getActivity(),Deerpark.class);
                    startActivity(i);
                }
                else if(position==2){
                    Intent i = new Intent(getActivity(),Lodhi.class);
                    startActivity(i);
                }
                else if(position==3){
                    Intent i = new Intent(getActivity(),Nationalzoo.class);
                    startActivity(i);
                }
                else if(position==4){
                    Intent i = new Intent(getActivity(),Nehrupark.class);
                    startActivity(i);
                }


            }
        });
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    class Myadapter extends ArrayAdapter<String> {

        Myadapter(@NonNull Context context) {
            super(context, R.layout.mylayout,R.id.tv,arr);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.mylayout,parent,false);
            ImageView imageView = view.findViewById(R.id.image);
            TextView tv = view.findViewById(R.id.tv);
            tv.setText(arr[position]);
            imageView.setImageResource(imageId[position]);
            return view;
        }
    }
}
