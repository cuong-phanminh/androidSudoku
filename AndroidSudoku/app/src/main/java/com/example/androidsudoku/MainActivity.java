package com.example.androidsudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

import static java.lang.Math.random;

public class MainActivity<i> extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btnLevel1, btnNumber1, btnNumber2, btnNumber3, btnNumber4;
    //    EditText editText;
    String number = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String arr[] = {"btn1", "btn2", "btn3", "btn4", "btn5", "btn6", "btn7", "btn8", "btn9", "btn10", "btn11", "btn12", "btn13", "btn14", "btn15", "btn16"};
        int num[] = {'1', '4', '3', '2', '3', '2', '1', '4', '2', '3', '4', '1', '4', '1', '2', '3'};

        btnNumber1 = findViewById(R.id.btnNumber1);
        btnNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=(btnNumber1.getText().toString());
            }
        });
        btnNumber2 = findViewById(R.id.btnNumber2);
        btnNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=(btnNumber2.getText().toString());
            }
        });
        btnNumber3 = findViewById(R.id.btnNumber3);
        btnNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=(btnNumber3.getText().toString());
            }
        });
        btnNumber4 = findViewById(R.id.btnNumber4);
        btnNumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=(btnNumber4.getText().toString());
            }
        });
//        editText = findViewById(R.id.textview);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setText(number);
            }
        });

        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn6.setText(number);
            }
        });
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn9.setText(number);
            }
        });
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn11.setText(number);
            }
        });
        btn12 = findViewById(R.id.btn12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn12.setText(number);
            }
        });
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn15.setText(number);
            }
        });
        btn16 = findViewById(R.id.btn16);


        btnLevel1 = findViewById(R.id.btnLevel1);

        btnLevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level1();
            }
        });

    }


    public void level1() {
        btn1.setText("1");
        btn2.setText("4");
        btn4.setText("2");
        btn5.setText("3");
        btn7.setText("1");
        btn8.setText("4");
        btn10.setText("3");
        btn13.setText("4");
        btn14.setText("1");
        btn16.setText("3");
    }
//public void checkWin(){
//        for(int i=0;i< number.length();i++)
//}

//    public void chosenumber(View view) {
//        String btnId = ((Button) view).getResources().getResourceEntryName(((Button) view).getId());
//        ((Button)view).setText("txbText");
//
//    }

}



