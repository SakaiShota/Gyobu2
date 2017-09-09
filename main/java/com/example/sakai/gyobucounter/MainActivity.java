package com.example.sakai.gyobucounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button cherry;
    Button dosyoku;
    Button nazo;
    Button odd;
    Button even;
    Button reset;
    Button calc;

    TextView cherry_count;
    TextView dosyoku_count;
    TextView nazo_count;
    TextView odd_count;
    TextView even_count;
    TextView reset_count;
    TextView calc_count;
    TextView cherry_kakuritu;

    EditText game_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cherry = (Button)findViewById(R.id.cherry);
        dosyoku = (Button)findViewById(R.id.dosyoku);
        nazo = (Button)findViewById(R.id.nazo);
        odd = (Button)findViewById(R.id.odd);
        even = (Button)findViewById(R.id.even);
        reset = (Button)findViewById(R.id.reset);
        calc = (Button)findViewById(R.id.calc);

        cherry_count = (TextView)findViewById(R.id.cherry_count);
        dosyoku_count = (TextView)findViewById(R.id.dosyoku_count);
        nazo_count = (TextView) findViewById(R.id.nazo_count);
        odd_count = (TextView) findViewById(R.id.odd_count);
        even_count = (TextView) findViewById(R.id.even_count);
        reset_count = (TextView) findViewById(R.id.reset_count);
        calc_count = (TextView) findViewById(R.id.calc_count);
        cherry_kakuritu = (TextView) findViewById(R.id.cherry_kakuritu);

        game_number = (EditText) findViewById(R.id.game_number);

        cherry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        dosyoku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        nazo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        odd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        even.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
