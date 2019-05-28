package com.esen.kubanychbekov.homework_2_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView textView1;
    String  text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent intent = getIntent();
        text1 = intent.getStringExtra(Intent.EXTRA_TEXT);
        textView1 = findViewById(R.id.textView1_1);
        textView1.setText(text1);


    }
}
