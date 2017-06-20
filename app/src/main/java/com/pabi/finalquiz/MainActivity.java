package com.pabi.finalquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnnum,btncity,btntime;
    public static int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnnum = (Button)findViewById(R.id.btnnum);
        btnnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NumberQuiz.class);
                startActivity(intent);
            }
        });
        btncity = (Button)findViewById(R.id.btncity);
        btncity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CitiesQuiz.class);
                startActivity(intent);
            }
        });

        btntime = (Button)findViewById(R.id.btntime);
        btntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TimeQuizActivity.class);
                startActivity(intent);
            }
        });

    }
}


