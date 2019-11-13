package com.example.androidsudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity<i> extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btnLevel1, btnNumber1, btnNumber2, btnNumber3, btnNumber4, btnCheckwin;
    //    EditText editText;
    String number = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNumber1 = findViewById(R.id.btnNumber1);
        btnNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = (btnNumber1.getText().toString());
            }
        });
        btnNumber2 = findViewById(R.id.btnNumber2);
        btnNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = (btnNumber2.getText().toString());
            }
        });
        btnNumber3 = findViewById(R.id.btnNumber3);
        btnNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = (btnNumber3.getText().toString());
            }
        });
        btnNumber4 = findViewById(R.id.btnNumber4);
        btnNumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = (btnNumber4.getText().toString());
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

        btnCheckwin = findViewById(R.id.btnCheckwin);
        btnCheckwin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkWin();
            }
        });
    }

    public void level1() {
        btn1.setText("1");
        btn2.setText("4");
        btn3.setText("");
        btn4.setText("2");
        btn5.setText("3");
        btn6.setText("");
        btn7.setText("1");
        btn8.setText("4");
        btn9.setText("");
        btn10.setText("3");
        btn11.setText("");
        btn12.setText("");
        btn13.setText("4");
        btn14.setText("1");
        btn15.setText("");
        btn16.setText("3");
    }

    public void checkWin() {
        String btn1Text = btn1.getText().toString();
        String btn2Text = btn2.getText().toString();
        String btn3Text = btn3.getText().toString();
        String btn4Text = btn4.getText().toString();
        String btn5Text = btn5.getText().toString();
        String btn6Text = btn6.getText().toString();
        String btn7Text = btn7.getText().toString();
        String btn8Text = btn8.getText().toString();
        String btn9Text = btn9.getText().toString();
        String btn10Text = btn10.getText().toString();
        String btn11Text = btn11.getText().toString();
        String btn12Text = btn12.getText().toString();
        String btn13Text = btn13.getText().toString();
        String btn14Text = btn14.getText().toString();
        String btn15Text = btn15.getText().toString();
        String btn16Text = btn16.getText().toString();
        String result[] = {btn1Text, btn2Text, btn3Text, btn4Text, btn5Text, btn6Text, btn7Text, btn8Text, btn9Text, btn10Text, btn11Text, btn12Text, btn13Text, btn14Text, btn15Text, btn16Text};
        int j = 0;
        for (int i = 0; i < result.length; i++) {
            String num[] = {"1", "4", "3", "2", "3", "2", "1", "4", "2", "3", "4", "1", "4", "1", "2", "3"};
            if (result[i].equals(num[j]) ) {
                j++;
                Log.i("Di Cuong", String.valueOf(j));
            } else {
                Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
            }
        }

    }

}



