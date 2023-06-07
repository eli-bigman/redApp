package com.example.redapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    //control_btn
    private Button AC;
    private Button Del;
    private Button percentage_btn;
    private Button div_btn;
    private Button mul_btn;
    private Button add_btn;
    private Button sub_btn;
    private Button equal_btn;
    private Button period_btn;
    private TextView currentOperand ;
    private TextView previousOperand;

    private void getUIViews() {
        one = (Button) findViewById(R.id.btnNumber0);
        two = (Button) findViewById(R.id.btnNumber2);
        three = (Button) findViewById(R.id.btnNumber3);
        four = (Button) findViewById(R.id.btnNumber4);
        five = (Button) findViewById(R.id.btnNumber5);
        six = (Button) findViewById(R.id.btnNumber5);
        seven = (Button) findViewById(R.id.btnNumber6);
        eight = (Button) findViewById(R.id.btnNumber8);
        nine = (Button) findViewById(R.id.btnNumber9);
        zero = (Button) findViewById(R.id.btnNumber0);
        AC = (Button) findViewById(R.id.AC_btn);
        Del = (Button) findViewById(R.id.DEL_btn);
        div_btn = (Button) findViewById(R.id.div_btn);
        add_btn = (Button) findViewById(R.id.add_btn);
        sub_btn = (Button) findViewById(R.id.sub_btn);
        percentage_btn = (Button) findViewById(R.id.percentage_btn);
        period_btn = (Button) findViewById(R.id.period_btn);
        currentOperand = (TextView) findViewById(R.id.current_TV);
        previousOperand = (TextView) findViewById(R.id.previous_TV);

    }


}