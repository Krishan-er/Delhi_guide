package com.example.krishan.travels;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Ansal extends Activity {
    Button view,call,review,rate;
    final int REVIEWS= 4;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ansal);

        view = findViewById(R.id.view);
        call = findViewById(R.id.call);
        review = findViewById(R.id.review);
        rate = findViewById(R.id.rate);
        textView = findViewById(R.id.tvansal);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ansal.this,Ansalmap.class);
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
                Intent i = new Intent(Ansal.this,Review.class);
                startActivityForResult(i,REVIEWS);
            }
        });

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ansal.this,Rate.class);
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
