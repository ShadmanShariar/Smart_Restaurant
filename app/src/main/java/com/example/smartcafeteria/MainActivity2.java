package com.example.smartcafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv1 ;
    private Button btn2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = (TextView) findViewById(R.id.textView4);
        btn2 = (Button) findViewById(R.id.button2);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(intent);


            }
        });
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);


            }
        });

    }
}