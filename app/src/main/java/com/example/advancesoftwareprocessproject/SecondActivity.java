package com.example.advancesoftwareprocessproject;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        text = (TextView) findViewById(R.id.textView1);

        int[] Inputs = getIntent().getIntArrayExtra("Inputs");

        for(int i=0; i<Inputs.length;i++){
            System.out.println(Inputs[i]);
        }

//        int input[] = getIntent().getStringExtra("key");
//
        text.setText("Hiii");
    }

}
