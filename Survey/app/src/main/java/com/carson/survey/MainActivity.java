package com.carson.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mPizzaButton;
    Button mTacoButton;
    TextView mPizzaCount;
    TextView mTacoCount;
    Button mResetButton;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPizzaButton = findViewById(R.id.pizza_button);
        mTacoButton = findViewById(R.id.taco_button);
        mPizzaCount = findViewById(R.id.pizza_count);
        mTacoCount = findViewById(R.id.taco_count);
        mResetButton = findViewById(R.id.reset_button);



        //pizza button click listener includes pizza count
        mPizzaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pizza = 0;
                pizza++;
                mPizzaCount.setText(pizza);

            }
        });
        //taco button click listener includes taco count
        mTacoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int taco = 0;
                taco++;
                mTacoCount.setText(taco);
            }
        });
        //clear button
        mResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*pizza = 0;
                mPizzaCount.setText(pizza);
                taco = 0;
                mTacoCount.setText(taco);*/
            }
        });





    }
}
