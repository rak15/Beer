package com.example.rakesh.beer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Spinner sp;
    String type;
    BeerExpert expert=new BeerExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textView);
    }

    public void findBeer(View view) {
        sp=(Spinner)findViewById(R.id.color);
        type=String.valueOf(sp.getSelectedItem());  // get selected item from spinner and convert into stream
        List<String> brandsList = expert.getBeer(type);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {         //getting all strings from arraylist into a single string variable
            brandsFormatted.append(brand).append('\n');    //will add \n after each string i string list
        }
//Display the beers
        tv.setText(brandsFormatted);
    }
    }
