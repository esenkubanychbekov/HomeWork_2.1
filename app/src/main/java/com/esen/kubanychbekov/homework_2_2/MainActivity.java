package com.esen.kubanychbekov.homework_2_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button1, button2;
    EditText name;
    EditText surname;
    EditText thirdName;
    String textName, textSurname, textThirdName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button2);
        button2 = findViewById(R.id.button1);
        surname = findViewById(R.id.EditText_1);
        name = findViewById(R.id.EditText_2);
        thirdName = findViewById(R.id.EditText_3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                textSurname = surname.getText().toString();
                textName = name.getText().toString();
                textThirdName = thirdName.getText().toString();
                intent.putExtra("Value1", textSurname);
                intent.putExtra("Value2", textName);
                intent.putExtra("Value3",textThirdName);
                startActivity(intent);
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,"Kubanychbekov Esen Kubanychbekovich");
                intent.setType("text/plain");

                if (intent.resolveActivity(getPackageManager()) !=null){
                    startActivity(intent);
                }
            }
        });
    }
}
