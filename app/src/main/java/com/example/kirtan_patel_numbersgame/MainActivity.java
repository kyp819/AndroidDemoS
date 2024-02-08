package com.example.kirtan_patel_numbersgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    public TextView id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id = findViewById(R.id.sid);

        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

    }
    public void btnClick(android.view.View view) {

        Button button = (Button) view;
        int Text = Integer.parseInt(button.getText().toString());

        Text += (Text < 5) ? 1 : (Text > 5) ? -1 : 0;

        button.setText(String.valueOf(Text));
    }

    public void btnReset(android.view.View view) {

        String stu_id = id.getText().toString();
        char[] stuarr = stu_id.toCharArray();
        int arrlength = stuarr.length;


        Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};

        for (int i = 0; i < 9 && i < arrlength; i++) {
            buttons[i].setText(String.valueOf(stuarr[i]));
        }



    }




}

