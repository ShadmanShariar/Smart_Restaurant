package com.example.smartcafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity5 extends AppCompatActivity {
private TextView dis;
private Button plc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
dis = (TextView)findViewById(R.id.dis);
String total ="";

        ArrayList<String> str = getIntent().getStringArrayListExtra("str");
        ArrayList<String> qn = getIntent().getStringArrayListExtra("qn");
        ArrayList<String> pr = getIntent().getStringArrayListExtra("pr");

        for (int i = 0; i < str.size() ; i++) {

            total+=((i+1)+". ")+(str.get(i))+"-"+(qn.get(i))+"-"+(pr.get(i));
            total+="\n";
        }
        total+="Total Amount     =     "+(getIntent().getStringExtra("tot").toString());
dis.setText(total);
plc = (Button) findViewById(R.id.plc);

plc.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {


        Toast.makeText(MainActivity5.this, "Order Placed", Toast.LENGTH_SHORT).show();
    }
});


    }
}