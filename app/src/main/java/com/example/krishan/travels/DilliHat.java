package com.example.krishan.travels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DilliHat extends AppCompatActivity {
    Button view,call,review,rate;
    final int REVIEWS = 4;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilli_hat);

        view = findViewById(R.id.view);
        call = findViewById(R.id.call);
        review = findViewById(R.id.review);
        rate = findViewById(R.id.rate);
        textView = findViewById(R.id.tvdilli);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DilliHat.this,DilliHat.class);
                startActivity(i);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DilliHat.this, com.example.krishan.travels.Call.class);
                startActivity(i);
            }
        });

        review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DilliHat.this,Review.class);
                startActivityForResult(i,REVIEWS);
            }
        });
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DilliHat.this,Rate.class);
                startActivity(i);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String review;
        if (requestCode == REVIEWS && resultCode == RESULT_OK){
            review = data.getStringExtra("review");
            textView.setText(review);
        }
        else if (resultCode == RESULT_CANCELED){
            Toast.makeText(this, "Please give your review", Toast.LENGTH_SHORT).show();
        }
    }
}
