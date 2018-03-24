package com.example.sravanreddy.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private int count;
    Button toastbutton;
    Button countbutton;
    TextView countText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = 0;
        countText=findViewById(R.id.countTextView);
        toastbutton=findViewById(R.id.toastButton);
        toastbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.toast_message, Toast.LENGTH_SHORT).show();
            }
        });
        countbutton=findViewById(R.id.countButton);
        countbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++count;
                countText.setText(""+count);

            }
        });


    }

}
