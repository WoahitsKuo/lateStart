package com.example.csaper6.latestart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
    private TextView daytext;
    private TextView monthtext;
    private TextView latestart;

    private String dateString;
    private String monthString;

    private int date;
    private int month;

private int[][] datearray = new int[13][];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar c = Calendar.getInstance();
        date = c.get(Calendar.DATE);
        int seconds = c.get(Calendar.SECOND);
        month = c. get(Calendar.MONTH);
        dateString = "Date: " + date;
        month = month +1;
        monthString = "Month: " + month;

        daytext = (TextView) findViewById(R.id.dayText);
        monthtext = (TextView) findViewById(R.id.monthText);
        latestart = (TextView) findViewById(R.id.latestartText);

        daytext.setText(dateString);
        monthtext.setText(monthString);

                datearray[0] = new int[]{100,0};
                datearray[1] = new int[]{10,11};
                datearray[2] = new int[]{7,8,21,22};
                datearray[3] = new int[]{7,8,28,29};
                datearray[4] = new int[]{18,19};
                datearray[5] = new int[]{2,3,16,17,30,31};
                datearray[6] = new int[]{100,0};
                datearray[7] = new int[]{100,0};
                datearray[8] = new int[]{100,0};
                datearray[9] = new int[]{100,0};

                datearray[10] = new int[]{19, 20};
                datearray[11] = new int[]{1,2,15,16};
                datearray[12] = new int[]{6,7};


        checkLatestart();







    }

    private void checkLatestart() {

        for(int i = 0; i <= datearray[month].length-1;i++) {
            if (date == datearray[month][i])
                latestart.setText("YES");
            else
                latestart.setText("NO");
        }
        }
    }


