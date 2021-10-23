package com.mirea.avtaevms.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView) findViewById(R.id.textView2);
        myTextView.setText("New text in MIREA");
        Button button = findViewById(R.id.button13);
        button.setText("МireaButton");

    }

}