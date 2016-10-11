package com.example.csaper6.latestart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
    private TextView daytext;
    private TextView monthtext;

    private String dateString;
    private String monthString;

    //private int[][] date{};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar c = Calendar.getInstance();
        int date = c.get(Calendar.DATE);
        int seconds = c.get(Calendar.SECOND);
        int month = c. get(Calendar.MONTH);
        dateString = "Date: " + date;
        monthString = "Month: " + month;

        daytext = (TextView) findViewById(R.id.dayText);
        monthtext = (TextView) findViewById(R.id.monthText);

        daytext.setText(dateString);
        monthtext.setText(monthString);


    }

}
