package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView result_view, math_info_view, temp_math;
    private SwitchCompat switch1;
    boolean equal_pressed = false;

    private Button one, two, three, four, five, six, seven, eight, nine, zero, div, multi, sub, plus, dot, equals, clear, del, exp, modulo;
    String operator;
    float number1, number2, result;


    public boolean isNightMode(Context context) {
        int nightModeFlags = context.getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
        return nightModeFlags == Configuration.UI_MODE_NIGHT_YES;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity_main);
        switch1 = findViewById(R.id.switch1);


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


        result_view = findViewById(R.id.result);
        math_info_view = findViewById(R.id.math_info);
        temp_math = findViewById(R.id.temp_math);

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
        result_view.setOnClickListener(this);
        div.setOnClickListener(this);
        multi.setOnClickListener(this);
        sub.setOnClickListener(this);
        plus.setOnClickListener(this);
        clear.setOnClickListener(this);
        del.setOnClickListener(this);
        exp.setOnClickListener(this);
        modulo.setOnClickListener(this);


        if (isNightMode(this)) {
            switch1.setChecked(true);
        } else {
            switch1.setChecked(false);

        }


        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switch1.isChecked()) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    Toast.makeText(MainActivity.this, "Dark mode on", Toast.LENGTH_SHORT).show();
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    Toast.makeText(MainActivity.this, "Dark mode off", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    public void onClick(View v) {
        if (v.findViewById(R.id.one) == one) {
            if (equal_pressed) {
                result_view.setText("");
                math_info_view.setText("");
                equal_pressed = false;
            }
            if (math_info_view.getText().equals("")) {
                temp_math.setText("1");
                math_info_view.setText("1");
            } else {
                temp_math.setText(temp_math.getText() + "1");
                math_info_view.setText(math_info_view.getText() + "1");
            }

//            if (!result_view.getText().equals("")) {
//                result_view.append("1");
//            } else {
//                result_view.setText("1");
//            }
        } else if (v.findViewById(R.id.two) == two) {
            if (equal_pressed) {
                result_view.setText("");
                math_info_view.setText("");
                equal_pressed = false;
            }
            if (math_info_view.getText().equals("")) {
                temp_math.setText("2");
                math_info_view.setText("2");
            } else {
                temp_math.setText(temp_math.getText() + "2");
                math_info_view.setText(math_info_view.getText() + "2");
            }


//            if (!result_view.getText().equals("")) {
//                result_view.append("2");
//            } else {
//
//                result_view.setText("2");
//            }
        } else if (v.findViewById(R.id.three) == three) {
            if (equal_pressed) {
                result_view.setText("");
                math_info_view.setText("");
                equal_pressed = false;
            }
            if (math_info_view.getText().equals("")) {
                temp_math.setText("3");
                math_info_view.setText("3");
            } else {
                math_info_view.setText(math_info_view.getText() + "3");
                temp_math.setText(temp_math.getText() + "3");
            }
//


//            if (!result_view.getText().equals("")) {
//                result_view.append("3");
//            } else {
//                result_view.setText("3");
//            }
        } else if (v.findViewById(R.id.four) == four) {
            if (equal_pressed) {
                result_view.setText("");
                math_info_view.setText("");
                equal_pressed = false;
            }
            if (math_info_view.getText().equals("")) {
                temp_math.setText("4");
                math_info_view.setText("4");
            } else {
                math_info_view.setText(math_info_view.getText() + "4");
                temp_math.setText(temp_math.getText() + "4");
            }
//            if (!result_view.getText().equals("")) {
//                result_view.append("4");
//            } else {
//                result_view.setText("4");
//            }
        } else if (v.findViewById(R.id.five) == five) {
            if (equal_pressed) {
                result_view.setText("");
                math_info_view.setText("");
                equal_pressed = false;
            }
            if (math_info_view.getText().equals("")) {
                math_info_view.setText("5");
                temp_math.setText("5");
            } else {
                math_info_view.setText(math_info_view.getText() + "5");
                temp_math.setText(temp_math.getText() + "5");
            }

//            if (!result_view.getText().equals("")) {
//                result_view.append("5");
//            } else {
//                result_view.setText("5");
//            }
        } else if (v.findViewById(R.id.six) == six) {
            if (equal_pressed) {
                result_view.setText("");
                math_info_view.setText("");
                equal_pressed = false;
            }
            if (math_info_view.getText().equals("")) {

                math_info_view.setText("6");
                temp_math.setText("6");
            } else {
                math_info_view.setText(math_info_view.getText() + "6");
                temp_math.setText(temp_math.getText() + "6");
            }
//            if (!result_view.getText().equals("")) {
//                result_view.append("6");
//            } else {
//                result_view.setText("6");
//            }
        } else if (v.findViewById(R.id.seven) == seven) {
            if (equal_pressed) {
                result_view.setText("");
                math_info_view.setText("");
                equal_pressed = false;
            }
            if (math_info_view.getText().equals("")) {

                math_info_view.setText("7");
                temp_math.setText("7");
            } else {
                math_info_view.setText(math_info_view.getText() + "7");
                temp_math.setText(temp_math.getText() + "7");
            }


//            if (!result_view.getText().equals("")) {
//                result_view.append("7");
//            } else {
//                result_view.setText("7");
//            }
        } else if (v.findViewById(R.id.eight) == eight) {
            if (equal_pressed) {
                result_view.setText("");
                math_info_view.setText("");
                equal_pressed = false;
            }
            if (math_info_view.getText().equals("")) {

                math_info_view.setText("8");
                temp_math.setText("8");
            } else {
                math_info_view.setText(math_info_view.getText() + "8");
                temp_math.setText(temp_math.getText() + "8");
            }
//            if (!result_view.getText().equals("")) {
//                result_view.append("8");
//            } else {
//                result_view.setText("8");
//            }
        } else if (v.findViewById(R.id.nine) == nine) {
            if (equal_pressed) {
                result_view.setText("");
                math_info_view.setText("");
                equal_pressed = false;
            }
            if (math_info_view.getText().equals("")) {
                math_info_view.setText("9");
                temp_math.setText("9");

            } else {
                math_info_view.setText(math_info_view.getText() + "9");
                temp_math.setText(temp_math.getText() + "9");
            }
//            if (!result_view.getText().equals("")) {
//                result_view.append("9");
//            } else {
//                result_view.setText("9");
//            }
        } else if (v.findViewById(R.id.zero) == zero) {
            if (equal_pressed) {
                result_view.setText("");
                math_info_view.setText("");
                equal_pressed = false;
            }
            if (math_info_view.getText().equals("")) {
                math_info_view.setText("0");
                temp_math.setText("0");

            } else {
                math_info_view.setText(math_info_view.getText() + "0");
                temp_math.setText(temp_math.getText() + "0");


            }
//            if (!result_view.getText().equals("")) {
//                result_view.append("0");
//            } else {
//                result_view.setText("0");
//            }
        } else if (v.findViewById(R.id.plus) == plus) {
            if (equal_pressed) {
                result_view.setText("");
                math_info_view.setText("");
                equal_pressed = false;
            }

            operator= "+";


            if (math_info_view.getText().equals("")) {
                math_info_view.setText("+");
                temp_math.setText("@");
            } else {
                math_info_view.setText(math_info_view.getText() + "+");
                temp_math.setText(temp_math.getText() + "@");
            }

        } else if (v.findViewById(R.id.div) == div) {
            if (equal_pressed) {
                result_view.setText("");
                math_info_view.setText("");
                equal_pressed = false;
            }

            operator = "/";



            if (math_info_view.getText().equals("")) {
                math_info_view.setText("/");
                temp_math.setText("/");
            } else {
                math_info_view.setText(math_info_view.getText() + "/");
                temp_math.setText(temp_math.getText() + "/");
            }
        } else if (v.findViewById(R.id.multiply) == multi) {
            if (equal_pressed) {
                result_view.setText("");
                math_info_view.setText("");
                equal_pressed = false;
            }

            operator = "*";


            if (math_info_view.getText().equals("")) {
                math_info_view.setText("*");
                temp_math.setText(",");
            } else {
                math_info_view.setText(math_info_view.getText() + "*");
                temp_math.setText(temp_math.getText() + ",");
            }
        } else if (v.findViewById(R.id.sub) == sub) {
            if (equal_pressed) {
                result_view.setText("");
                math_info_view.setText("");
                equal_pressed = false;
            }



            operator = "-";

            if (math_info_view.getText().equals("")) {
                math_info_view.setText("-");
                temp_math.setText("-");
            } else {
                math_info_view.setText(math_info_view.getText() + "-");
                temp_math.setText(temp_math.getText() + "-");
            }

        } else if (v.findViewById(R.id.exp) == exp) {
            if (equal_pressed) {
                result_view.setText("");
                math_info_view.setText("");
                equal_pressed = false;
            }



            operator = "exp";



            if (math_info_view.getText().equals("")) {
                math_info_view.setText("^");
                temp_math.setText("#");
            } else {
                math_info_view.setText(math_info_view.getText() + "^");
                temp_math.setText(temp_math.getText() + "#");
            }
        } else if (v.findViewById(R.id.modulo) == modulo) {
            if (equal_pressed) {
                result_view.setText("");
                math_info_view.setText("");
                equal_pressed = false;
            }



            operator = "modulo";


            if (math_info_view.getText().equals("")) {
                math_info_view.setText("%");
                temp_math.setText("%");
            } else {
                math_info_view.setText(math_info_view.getText() + "%");
                temp_math.setText(temp_math.getText() + "%");
            }
        } else if (v.findViewById(R.id.ac) == clear) {
            result_view.setText(null);
            math_info_view.setText(null);
            temp_math.setText(null);
        } else if (v.findViewById(R.id.equal) == equals) {
            equal_pressed = true;

            if (operator=="+"){

                String str = temp_math.getText().toString();
                String [] arrOfStr = str.split("@", 5);
                float re = Float.parseFloat(arrOfStr[0]) + Float.parseFloat(arrOfStr[1]);
                result_view.setText(String.valueOf(re));
                Toast.makeText(this, "operator is "+arrOfStr, Toast.LENGTH_SHORT).show();

            } else if (Objects.equals(operator, "-")) {
                String str = temp_math.getText().toString();
                String[] arrOfStr = str.split("-", 5);
                float re = Float.parseFloat(arrOfStr[0]) - Float.parseFloat(arrOfStr[1]);
                result_view.setText(String.valueOf(re));


            } else if (Objects.equals(operator, "*")) {
                String str = temp_math.getText().toString();
                String[] arrOfStr = str.split(",", 5);
                float re = Float.parseFloat(arrOfStr[0]) * Float.parseFloat(arrOfStr[1]);
                result_view.setText(String.valueOf(re));

            } else if (Objects.equals(operator, "/")) {
                String str = temp_math.getText().toString();
                String[] arrOfStr = str.split("/", 5);
                float re = Float.parseFloat(arrOfStr[0]) / Float.parseFloat(arrOfStr[1]);
                result_view.setText(String.valueOf(re));
            } else if (Objects.equals(operator, "exp")) {

                String str = temp_math.getText().toString();
                String[] arrOfStr = str.split("#", 5);
                float re =(float) Math.pow(Float.parseFloat(arrOfStr[0]), Float.parseFloat(arrOfStr[1]));
                result_view.setText(String.valueOf(re));


            } else if (Objects.equals(operator, "modulo")) {

                String str = temp_math.getText().toString();
                String[] arrOfStr = str.split("%", 5);
                float re = Float.parseFloat(arrOfStr[0]) % Float.parseFloat(arrOfStr[1]);
                result_view.setText(String.valueOf(re));




            }

        } else if (v.findViewById(R.id.dot) == dot) {
            if (equal_pressed) {
                result_view.setText("");
                math_info_view.setText("");
                equal_pressed = false;
            }
            if (math_info_view.getText().equals("")) {

                math_info_view.setText(".");
                temp_math.setText(".");


            } else {
                math_info_view.setText(math_info_view.getText() + ".");
                temp_math.setText(temp_math.getText() + ".");
            }


//            if (!result_view.getText().equals("")) {
//                result_view.append(".");
//            } else {
//                result_view.setText(".");
//            }
        } else if (v.findViewById(R.id.del) == del) {
            if (!math_info_view.getText().equals("")) {
                String s = math_info_view.getText().toString();
                String s1 = temp_math.getText().toString();
                if (s.length() > 0) {
                    temp_math.setText(s1.substring(0, s1.length() - 1));
                    math_info_view.setText(s.substring(0, s.length() - 1));
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