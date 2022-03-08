package com.example.smartcafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;

public class MainActivity4 extends AppCompatActivity {
private Button btn4;
private CheckBox c1,c2,c3,c4,c5;
private EditText i1,i2,i3,i4,i5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        btn4 = (Button) findViewById(R.id.button4);
        c1 = (CheckBox) findViewById(R.id.checkBox);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);
        c4 = (CheckBox) findViewById(R.id.checkBox4);
        c5 = (CheckBox) findViewById(R.id.checkBox5);

        i1 = (EditText) findViewById(R.id.i1);
        i2 = (EditText) findViewById(R.id.i2);
        i3 = (EditText) findViewById(R.id.i3);
        i4 = (EditText) findViewById(R.id.i4);
        i5 = (EditText) findViewById(R.id.i5);


        btn4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        LinkedList<String> str = new LinkedList<String>();
        LinkedList<String> qn = new LinkedList<String>();
        LinkedList<String> pr = new LinkedList<String>();
        int v1 = 0, v2 =0  , v3 =0 , v4 = 0 , v5 =0 ;
        if(!i1.getText().toString().equals("")) {
           v1 = Integer.parseInt(i1.getText().toString());
        }
        if(!i2.getText().toString().equals("")) {
            v2 = Integer.parseInt(i2.getText().toString());
        }
        if(!i3.getText().toString().equals("")) {
            v3 = Integer.parseInt(i3.getText().toString());
        }
        if(!i4.getText().toString().equals("")) {
            v4 = Integer.parseInt(i4.getText().toString());
        }
        if(!i5.getText().toString().equals("")) {
            v5 = Integer.parseInt(i5.getText().toString());
        }
        int sum = 0;
        if(c1.isChecked()){
            sum+=(320*v1);
            pr.add((320*v1)+"");
            qn.add(v1+"");
            str.add("Americano Coffee");
        }
        if(c2.isChecked()){
            sum+=(380*v2);
            pr.add((380*v2)+"");
            qn.add(v2+"");
            str.add("Flat White Coffee");
        }
        if(c3.isChecked()){
            sum+=(350*v3);
            pr.add((350*v3)+"");
            qn.add(v3+"");
            str.add("Cappucino Coffee");
        }
        if(c4.isChecked()){
            sum+=(355*v4);
            pr.add((355*v4)+"");
            qn.add(v4+"");
            str.add("Macchiato Coffee");
        }
        if(c5.isChecked()){
            sum+=(345*v5);
            pr.add((345*v5)+"");
            qn.add(v5+"");
            str.add("Mocha Coffee");
        }
//        String h = sum+"";
//        Toast.makeText(MainActivity4.this, h, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MainActivity4.this,MainActivity5.class);
        intent.putExtra("tot",(sum+""));
        intent.putExtra("qn",qn);
        intent.putExtra("str",str);
        intent.putExtra("pr",pr);
        startActivity(intent);
    }
});


    }
}