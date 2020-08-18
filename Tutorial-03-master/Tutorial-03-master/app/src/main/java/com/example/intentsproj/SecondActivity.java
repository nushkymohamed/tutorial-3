package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button BtnP, BtnM, BtnMu, BtnD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String n1 = intent.getStringExtra(MainActivity.INPUT_NUM1);
        String n2 = intent.getStringExtra(MainActivity.INPUT_NUM2);

        final int nu1 = Integer.parseInt(n1);
        final int nu2 = Integer.parseInt(n2);

        TextView tx1 = findViewById(R.id.noOu1);
        tx1.setText(n1);

        TextView tx2 = findViewById(R.id.noOu2);
        tx2.setText(n2);

        BtnP = findViewById(R.id.btnP);
        BtnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int sum = nu1 + nu2;
                String f = Integer.toString(sum);
                String ans = nu1 + " + " + nu2 + " = " + f;
                TextView t1 = findViewById(R.id.outputText);
                t1.setText(ans);
            }
        });

        BtnM = findViewById(R.id.btnM);
        BtnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int sum = nu1 - nu2;
                String f = Integer.toString(sum);
                String ans = nu1 + " - " + nu2 + " = " + f;
                TextView t1 = findViewById(R.id.outputText);
                t1.setText(ans);
            }
        });

        BtnMu = findViewById(R.id.btnMu);
        BtnMu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int sum = nu1 * nu2;
                String f = Integer.toString(sum);
                String ans = nu1 + " * " + nu2 + " = " + f;
                TextView t1 = findViewById(R.id.outputText);
                t1.setText(ans);
            }
        });

        BtnD = findViewById(R.id.btnD);
        BtnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double sum = nu1 / nu2;
                String f = Double.toString(sum);
                String ans = nu1 + " / " + nu2 + " = " + f;
                TextView t1 = findViewById(R.id.outputText);
                t1.setText(ans);
            }
        });


    }
}