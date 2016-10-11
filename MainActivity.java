package com.example.csaper6.latestart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button checkButton;
    private int currentIndex;
    private TextView commandTextView;
    private String facts[] = {
            "Is it late start?",
            "hit me baby one more time",
            "Are you sure?",
            "What is harder to catch the faster to run",
            "Answer: your breath",
            "Fun fact: The stickers on fruit are made of edible paper",
            "Last one I promise!",
            "Lmao you thought"
    };
    private String buttons[] = {
            "check",
            "ok",
            "yes",
            "Late Start?",
            "click me",
            "last click!",
            "confirm",
            "lol"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //wire
        checkButton = (Button) findViewById(R.id.button_check);
        commandTextView = (TextView) findViewById(R.id.textView_command);

        //on clicks
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateQ();
            }
        });
    }
    private void updateQ() {
        currentIndex++;
        currentIndex = currentIndex % facts.length;
        commandTextView.setText(facts[currentIndex]);
        checkButton.setText(buttons[currentIndex]);
    }
}
