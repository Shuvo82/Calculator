package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView display;
    private Button one, two, three, four, five, six, seven, eight, nine, zero, div, multi, sub, plus, dot, equals, clear, del,exp,modulo;
    String operator;
    float number1, number2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity_main);




        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        equals = findViewById(R.id.equal);
        dot = findViewById(R.id.dot);
        display = findViewById(R.id.display);
        div = findViewById(R.id.div);
        multi = findViewById(R.id.multiply);
        sub = findViewById(R.id.sub);
        plus = findViewById(R.id.plus);
        clear = findViewById(R.id.ac);
        del = findViewById(R.id.del);
        exp = findViewById(R.id.exp);
        modulo = findViewById(R.id.modulo);


        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        equals.setOnClickListener(this);
        dot.setOnClickListener(this);
        display.setOnClickListener(this);
        div.setOnClickListener(this);
        multi.setOnClickListener(this);
        sub.setOnClickListener(this);
        plus.setOnClickListener(this);
        clear.setOnClickListener(this);
        del.setOnClickListener(this);
        exp.setOnClickListener(this);
        modulo.setOnClickListener(this);

    }


    public void onClick(View v) {
        if (v.findViewById(R.id.one) == one) {
            if (!display.getText().equals("")) {
                display.append("1");
            } else {
                display.setText("1");
            }
        }
        else if (v.findViewById(R.id.two) == two) {
            if (!display.getText().equals("")) {
                display.append("2");
            } else {
                display.setText("2");
            }
        }
        else if (v.findViewById(R.id.three) == three) {
            if (!display.getText().equals("")) {
                display.append("3");
            } else {
                display.setText("3");
            }
        }
        else if (v.findViewById(R.id.four) == four) {
            if (!display.getText().equals("")) {
                display.append("4");
            } else {
                display.setText("4");
            }
        }
        else if (v.findViewById(R.id.five) == five) {
            if (!display.getText().equals("")) {
                display.append("5");
            } else {
                display.setText("5");
            }
        }
        else if (v.findViewById(R.id.six) == six) {
            if (!display.getText().equals("")) {
                display.append("6");
            } else {
                display.setText("6");
            }
        }
        else if (v.findViewById(R.id.seven) == seven) {
            if (!display.getText().equals("")) {
                display.append("7");
            } else {
                display.setText("7");
            }
        }
        else if (v.findViewById(R.id.eight) == eight) {
            if (!display.getText().equals("")) {
                display.append("8");
            } else {
                display.setText("8");
            }
        }
        else if (v.findViewById(R.id.nine) == nine) {
            if (!display.getText().equals("")) {
                display.append("9");
            } else {
                display.setText("9");
            }
        }
        else if (v.findViewById(R.id.zero) == zero) {
            if (!display.getText().equals("")) {
                display.append("0");
            } else {
                display.setText("0");
            }
        }
        else if (v.findViewById(R.id.plus) == plus) {
            number1=Float.parseFloat(display.getText().toString());
            operator="+";
            display.setText("");

           // display.setText(result+"sss");


//            if (!display.getText().equals("")) {
//                display.append("+");
//            } else {
//                display.setText("+");
//            }
        }
        else if (v.findViewById(R.id.div) == div) {
            number1=Float.parseFloat(display.getText().toString());
            operator="/";
            display.setText("");
        }
        else if (v.findViewById(R.id.multiply) == multi) {
            number1=Float.parseFloat(display.getText().toString());
            operator="*";
            display.setText("");
        }
        else if (v.findViewById(R.id.sub) == sub) {
            number1=Float.parseFloat(display.getText().toString());
            operator="-";
            display.setText("");
        }
        else if (v.findViewById(R.id.exp) == exp) {
            number1=Float.parseFloat(display.getText().toString());
            operator="exp";
            display.setText("");
        }
        else if (v.findViewById(R.id.modulo) == modulo) {
            number1=Float.parseFloat(display.getText().toString());
            operator="modulo";
            display.setText("");
        }

        else if (v.findViewById(R.id.display) == display) {

        }
        else if (v.findViewById(R.id.ac) == clear) {
            display.setText(null);
        }
        else if (v.findViewById(R.id.equal) == equals) {

            if(operator=="+"){
                float temp=Float.parseFloat(display.getText().toString());
                result=number1+temp;
                display.setText(String.valueOf(result));

            }
            else if(operator=="-"){
                float temp=Float.parseFloat(display.getText().toString());
                result=number1-temp;
                display.setText(String.valueOf(result));

            }
            else if(operator=="*"){
                float temp=Float.parseFloat(display.getText().toString());
                result=number1*temp;
                display.setText(String.valueOf(result));

            }
            else if(operator=="/"){
                float temp=Float.parseFloat(display.getText().toString());
                result=number1/temp;
                display.setText(String.valueOf(result));

            }
            else if(operator=="exp"){

            }
            else if(operator=="modulo"){

            }
        }
        else if (v.findViewById(R.id.dot) == dot) {
            if (!display.getText().equals("")) {
                display.append(".");
            } else {
                display.setText(".");
            }
        }
        else if (v.findViewById(R.id.del) == del) {
            if (!display.getText().equals("")) {
                String s = display.getText().toString();
                if (s.length() > 0) {
                    display.setText(s.substring(0, s.length() - 1));
                } else {
                    Toast.makeText(this, "Nothing to remove", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "nothing to remove", Toast.LENGTH_SHORT).show();
            }

        }

    }


    private void calculate(String display) {
        // Custom input string



        Toast.makeText(this, display, Toast.LENGTH_SHORT).show();

    }


}