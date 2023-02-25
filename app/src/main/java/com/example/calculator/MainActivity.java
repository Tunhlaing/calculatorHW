package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;


public class MainActivity extends AppCompatActivity {

    TextView solution_tv,result_tv;
    private String inputData = "";

    MaterialButton button_c,button_open_bracket,button_close_bracket,button_divide,
            button_7,button_8,button_9,button_multiply,
            button_4,button_5,button_6,button_plus,
            button_1,button_2,button_3,button_minus,
            button_ac,button_0,button_dot,button_equals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        handleClicked();


                   }
    private void initView() {
        solution_tv = findViewById(R.id.solution_tv);
        result_tv = findViewById(R.id.result_tv);

        button_c = findViewById(R.id.button_c);
        button_open_bracket = findViewById(R.id.button_open_bracket);
        button_close_bracket = findViewById(R.id.button_close_bracket);
        button_divide = findViewById(R.id.button_divide);

        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_multiply = findViewById(R.id.button_multiply);

        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_plus = findViewById(R.id.button_plus);

        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_minus = findViewById(R.id.button_minus);

        button_ac = findViewById(R.id.button_ac);
        button_0 = findViewById(R.id.button_0);
        button_dot = findViewById(R.id.button_dot);
        button_equals = findViewById(R.id.button_equals);
    }
    public void onButtonClicked(View view){
            MaterialButton button = (MaterialButton) view;
            String data = button.getText().toString();
            inputData += data;
            solution_tv.setText(inputData);
    }
    public void handleClicked(){
        button_ac.setOnClickListener(view ->{
            solution_tv.setText("0");
            inputData = "";
        });
        button_c.setOnClickListener(view ->{
            String displayData1 = solution_tv.getText().toString();
            if (!displayData1.isEmpty()) {
                displayData1 = displayData1.substring(0,displayData1.length()-1);
                solution_tv.setText(displayData1);

            }
        });
    }



}
