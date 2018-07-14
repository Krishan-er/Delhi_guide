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
public class Historicalfrag extends Fragment {

    String arr[] = {"Akshardham Temple","Lotus Temple","Red Fort","Humayun's Tomb","Qutab Minar","India Gate"} ;
    Integer imageId[] ={R.drawable.akar,R.drawable.lotus,R.drawable.red,R.drawable.humanu,R.drawable.quatab,R.drawable.india};

    public Historicalfrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_historicalfrag, container, false);
        Historicalfrag.Myadapter adapter = new Historicalfrag.Myadapter(this.getActivity());
        ListView listView = v.findViewById(R.id.hist_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent i = new Intent(getActivity(),Aksardham.class);
                    startActivity(i);
                }

                if (position == 1){
                    Intent i = new Intent(getActivity(),Lotus.class);
                    startActivity(i);
                }

                if (position == 2){
                    Intent i = new Intent(getActivity(),Redfort.class);
                    startActivity(i);
                }

                if (position == 3){
                    Intent i = new Intent(getActivity(),Humaun.class);
                    startActivity(i);
                }

                if (position == 4){
                    Intent i = new Intent(getActivity(),Qutab.class);
                    startActivity(i);
                }

                if (position == 5){
                    Intent i = new Intent(getActivity(),Indiagate.class);
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
