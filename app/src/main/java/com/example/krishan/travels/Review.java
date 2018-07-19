package com.example.krishan.travels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Review extends AppCompatActivity {

    Button button;
    String data;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        et=findViewById(R.id.r);
        button = findViewById(R.id.submit);
        data=et.getText().toString();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String reviews = et.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("review",reviews);
                setResult(RESULT_OK,intent);
                Review.this.finish();

            }
        });
    }
}
