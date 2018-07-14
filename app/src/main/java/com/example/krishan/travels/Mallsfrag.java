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
public class Mallsfrag extends Fragment {


    String arr[] = {"SelectCity Mall","Ansal Plaza","City Square Mall","DLF Imporio","Pacific Mall","DLF Promenade","DLF Place Mall"} ;
    Integer imageId[] ={R.drawable.selectciti,R.drawable.ansal,R.drawable.squarecity,R.drawable.dlf_imporio,R.drawable.pacific,R.drawable.dlf_promnade,R.drawable.placemall};

    public Mallsfrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_mallsfrag, container, false);
        Mallsfrag.Myadapter apapter = new Mallsfrag.Myadapter(getActivity());
        ListView listView = v.findViewById(R.id.mall_l);
        listView.setAdapter(apapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent i = new Intent(getActivity(),Select_citywalk.class);
                    startActivity(i);
                }
                else if(position==1){
                    Intent i = new Intent(getActivity(),Ansal.class);
                    startActivity(i);
                }
                else if(position==2){
                    Intent i = new Intent(getActivity(),Citysquare.class);
                    startActivity(i);
                }
                else if(position==3){
                    Intent i = new Intent(getActivity(),Dlf_imporium.class);
                    startActivity(i);
                }
                else if(position==4){
                    Intent i = new Intent(getActivity(),Pacific.class);
                    startActivity(i);
                }
                else if(position==5){
                    Intent i = new Intent(getActivity(),Dlf_promnade.class);
                    startActivity(i);
                }
                else if(position==6){
                    Intent i = new Intent(getActivity(),Placemall.class);
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
