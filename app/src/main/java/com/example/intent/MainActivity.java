package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
private TextView mTextViewResult;
private TextView mtext;
private EditText edt1;
private EditText number1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextViewResult = findViewById(R.id.mTextViewResult);
        mtext = findViewById(R.id.textView);
        number1 = findViewById(R.id.editTextNumber);
        edt1 = findViewById(R.id.editTextNumber);
        Button buttonOpenActivity2 = findViewById(R.id.buttonOpenActivity2);
        Button btn1 = findViewById(R.id.button2);
        int num5 = 86;
        buttonOpenActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(number1.getText().toString());

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("number1",num1);
                startActivity(intent);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this,MainActivity3.class);
                intent1.putExtra("num5",num5);
                startActivity(intent1);
            }
        });
    }
}