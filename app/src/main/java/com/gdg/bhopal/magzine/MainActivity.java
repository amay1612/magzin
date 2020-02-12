package com.gdg.bhopal.magzine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button button3,button4,button5,button6,button7,button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensports();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpolitics();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlifestyle();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscience();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbusiness();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbollywood();
            }
        });

    }
    public void openbusiness(){
        Intent intent7=new Intent(MainActivity.this,business.class);
        startActivity(intent7);
    }

    public void openbollywood(){
        Intent intent8=new Intent(MainActivity.this,bollywood.class);
        startActivity(intent8);
    }

    public void openscience(){
        Intent intent6=new Intent(MainActivity.this,science.class);
        startActivity(intent6);
    }



    public void openlifestyle(){
        Intent intent5=new Intent(MainActivity.this,lifestyle.class);
        startActivity(intent5);
    }

    public void openpolitics(){
        Intent intent4=new Intent(MainActivity.this,politics.class);
        startActivity(intent4);
    }

    public void opensports(){
        Intent intent3=new Intent(MainActivity.this,sports.class);
        startActivity(intent3);
    }



}

