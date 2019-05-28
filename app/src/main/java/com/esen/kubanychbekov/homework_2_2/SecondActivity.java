package com.esen.kubanychbekov.homework_2_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView1, textView2,textView3;
    String  text1,text2,text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        text1 = getIntent().getExtras().getString("Value1");
        text2 = getIntent().getExtras().getString("Value2");
        text3 = getIntent().getExtras().getString("Value3");
        textView1.setText(text1);
        textView2.setText(text2);
        textView3.setText(text3);
    }
}
