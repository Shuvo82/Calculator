package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView display;
    private Button one, two, three, four, five, six, seven, eight, nine, zero, div, multi, sub, plus, dot, equals, clear,del;



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

    }
}