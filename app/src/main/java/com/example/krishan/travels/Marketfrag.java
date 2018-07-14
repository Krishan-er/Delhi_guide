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
public class Marketfrag extends Fragment {

    String arr[] = {"Ina Market","Dilli Hat","Nehru Place","Palika Bazar","Chandni Chowk","CottageEmporium"} ;
    Integer imageId[] ={R.drawable.cottage,R.drawable.haati,R.drawable.nehru,R.drawable.palika,R.drawable.chandani,R.drawable.cottage};

    public Marketfrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_marketfrag, container, false);
        ListView listView = v.findViewById(R.id.market_l);
        Marketfrag.Myadapter adapter=new Marketfrag.Myadapter(this.getActivity());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent i = new Intent(getActivity(),Ina.class);
                    startActivity(i);
                }

                if (position == 1){
                    Intent i = new Intent(getActivity(),DilliHat.class);
                    startActivity(i);
                }

                if (position == 2){
                    Intent i = new Intent(getActivity(),NehruP.class);
                    startActivity(i);
                }

                if (position == 3){
                    Intent i = new Intent(getActivity(),Palika.class);
                    startActivity(i);
                }

                if (position == 4){
                    Intent i = new Intent(getActivity(),Chandni.class);
                    startActivity(i);
                }

                if (position == 5){
                    Intent i = new Intent(getActivity(),CottageEmporium.class);
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
