package com.example.intentsproj;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String INPUT_NUM1 ="com.example.intentsproj.num1";
    public static final String INPUT_NUM2 ="com.example.intentsproj.num2";
    Button OkBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OkBtn = findViewById(R.id.OkBtn);

        OkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
                CharSequence message = "You just clicked the OK button";

                //Display string
                int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.BOTTOM| Gravity.CENTER, 0, 5);
                toast.show();

                //Explicit Intent
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                EditText et1 =findViewById(R.id.Num1);
                String Num1 =et1.getText().toString();

                EditText et2 =findViewById(R.id.Num2);
                String Num2 =et2.getText().toString();


                intent.putExtra(INPUT_NUM1,Num1);
                intent.putExtra(INPUT_NUM2,Num2);
                startActivity(intent);

            }
        });

        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();

        //Getting the View object as defined in the custom_toast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));

        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();

    }
}