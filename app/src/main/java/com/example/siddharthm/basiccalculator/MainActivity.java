package com.example.siddharthm.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String finalNumber;

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button bd;
    Button b0;
    Button be;
    Button div;
    Button mul;
    Button sub;
    Button add;
    Button calculate;
    Button reset;

    EditText t1;
    TextView t2;
    public String s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b7 = (Button)findViewById(R.id.button5);
        b8 = (Button)findViewById(R.id.button6);
        b9 = (Button)findViewById(R.id.button7);
        b4 = (Button)findViewById(R.id.button8);
        b5 = (Button)findViewById(R.id.button9);
        b6 = (Button)findViewById(R.id.button10);
        b1 = (Button)findViewById(R.id.button11);
        b2 = (Button)findViewById(R.id.button12);
        b3 = (Button)findViewById(R.id.button13);

        b0 = (Button)findViewById(R.id.button33);

        div = (Button)findViewById(R.id.button27);
        mul = (Button)findViewById(R.id.button28);
        sub = (Button)findViewById(R.id.button29);
        add = (Button)findViewById(R.id.button30);
        calculate = (Button)findViewById(R.id.button38);
        reset = (Button)findViewById(R.id.button40);
        t1 = (EditText)findViewById(R.id.textView3);
        t2 = (TextView)findViewById(R.id.textView5);


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberAdd("7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberAdd("8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberAdd("9");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberAdd("6");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberAdd("5");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberAdd("4");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberAdd("3");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberAdd("2");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberAdd("1");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberAdd("0");
            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation("/");

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation("*");

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation("-");

            }
        });
        add.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation("+");

            }
        }));
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearbutton();
            }
        });


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equaloperation();
            }
        });

    }
    String num1;
    String oper;


     String operator;
    private void operation(String s) {
      num1  =  t1.getText().toString();
     clearbutton();
      oper = s;
}

    private void clearbutton() {
         res = "";
        t1.setText("");
        t2.setText("");
    }
    String res;

    private void equaloperation() {
        int number1 = Integer.valueOf(num1);
        int number2 = Integer.valueOf(t1.getText().toString());
        int result = 0;
        String res;
         if(oper == "+"){
             result = number1 + number2;
             res = String.valueOf(result);
             t2.setText(res);
         }
        else if(oper == "-"){
            result = number1 - number2;
            res = String.valueOf(result);
            t2.setText(res);
        }
        if(oper == "*"){
            result = number1 * number2;
            res = String.valueOf(result);
            t2.setText(res);
        }
        if(oper == "/"){
            result = number1 / number2;
            res = String.valueOf(result);
            t2.setText(res);
        }

    }

    private void numberAdd(String s) {
        finalNumber = t1.getText().toString();
        finalNumber = finalNumber + s;
        t1.setText(finalNumber);
        }




}
