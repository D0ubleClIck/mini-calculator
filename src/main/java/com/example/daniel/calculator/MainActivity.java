package com.example.daniel.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Calculate(View v){

        EditText z1 = (EditText)findViewById(R.id.field1);
        EditText z2 = (EditText)findViewById(R.id.field2);
        EditText res = (EditText)findViewById(R.id.result);


        Integer num1 = Integer.parseInt(z1.getText().toString());
        Integer num2 = Integer.parseInt(z1.getText().toString());

        res.setText(String.valueOf(num1 + num2));





    }
}
