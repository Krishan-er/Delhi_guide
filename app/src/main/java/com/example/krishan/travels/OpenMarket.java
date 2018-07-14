package com.example.krishan.travels;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class OpenMarket extends AppCompatActivity {
    String arr[] = {"Ina Market","Dilli Hat","Nehru Place","Palika Bazar","Chandni Chowk","CottageEmporium"} ;
    Integer imageId[] ={R.drawable.cottage,R.drawable.haati,R.drawable.nehru,R.drawable.palika,R.drawable.chandani,R.drawable.cottage};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_market);
        Myadapter apapter = new Myadapter(this);
        ListView listView = findViewById(R.id.list1);
        listView.setAdapter(apapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent i = new Intent(OpenMarket.this,Ina.class);
                    startActivity(i);
                }

                if (position == 1){
                    Intent i = new Intent(OpenMarket.this,DilliHat.class);
                    startActivity(i);
                }

                if (position == 2){
                    Intent i = new Intent(OpenMarket.this,NehruP.class);
                    startActivity(i);
                }

                if (position == 3){
                    Intent i = new Intent(OpenMarket.this,Palika.class);
                    startActivity(i);
                }

                if (position == 4){
                    Intent i = new Intent(OpenMarket.this,Chandni.class);
                    startActivity(i);
                }

                if (position == 5){
                    Intent i = new Intent(OpenMarket.this,CottageEmporium.class);
                    startActivity(i);
                }



            }
        });
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


