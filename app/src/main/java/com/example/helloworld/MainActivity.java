package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   // I added comment to text push
    Button b;
    EditText E;
    TextView v ;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button)findViewById(R.id.hbutton);
        E = (EditText) findViewById(R.id.PersonName);
        v = (TextView) findViewById(R.id.textView);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = E.getText().toString();
                sentData(s);


            }
        });



    }

    private void sentData(String s) {
        v.setText("Hello, "+s);

    }
}