package com.example.smartcafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
private Button btn3;
private EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn3 = (Button) findViewById(R.id.button3);
        name = (EditText)findViewById(R.id.name);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,MainActivity2.class);
                Toast.makeText(MainActivity3.this, "Registration Done", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}