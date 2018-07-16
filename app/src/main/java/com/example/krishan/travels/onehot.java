package com.example.krishan.travels;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class onehot extends AppCompatActivity {
    Button book,call,review,rate;
    final int REVIEWS = 4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onehot);
        book = findViewById(R.id.book);
        call = findViewById(R.id.call);
        review = findViewById(R.id.review);
        rate = findViewById(R.id.rate);


        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(onehot.this,Onehotmap.class);
                startActivity(i);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01143235100"));
                startActivity(i);
            }
        });

        review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(onehot.this,Review.class);
                startActivityForResult(i,REVIEWS);
            }
        });

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(onehot.this,Rate.class);
                startActivity(i);
            }
        });

    }
}
