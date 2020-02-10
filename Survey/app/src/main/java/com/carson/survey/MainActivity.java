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

    int pizza = 0;
    int taco = 0;

    private static final String SURVEY_KEY = "survey-bundle-key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPizzaButton = findViewById(R.id.pizza_button);
        mTacoButton = findViewById(R.id.taco_button);
        mPizzaCount = findViewById(R.id.pizza_count);
        mTacoCount = findViewById(R.id.taco_count);
        mResetButton = findViewById(R.id.reset_button);

        if (savedInstanceState != null){
            pizza = savedInstanceState.getString(SURVEY_KEY, pizzaString);
            taco = savedInstanceState.getString(SURVEY_KEY, tacoString);
        }

        if (pizza == 0 & taco == 0){
            taco = 0;
            pizza = 0;
            String pizzaString = String.valueOf(pizza);
            mPizzaCount.setText(pizzaString);
            String tacoString = String.valueOf(taco);
            mTacoCount.setText(tacoString);
        }

        //pizza button click listener includes pizza count
        mPizzaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pizza++;
                String pizzaString = String.valueOf(pizza);
                mPizzaCount.setText(pizzaString);

            }
        });
        //taco button click listener includes taco count
        mTacoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                taco++;
                String tacoString = String.valueOf(taco);
                mTacoCount.setText(tacoString);
            }
        });
        //clear button
        mResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pizza = 0;
                String pizzaString = String.valueOf(pizza);
                mPizzaCount.setText(pizzaString);
                int taco = 0;
                String tacoString = String.valueOf(taco);
                mTacoCount.setText(tacoString);
            }
        });

    }

    @Override
    public void onSaveInstanceState(Bundle outBundle) {
        super.onSaveInstanceState(outBundle);
        String pizzaString = String.valueOf(pizza);
        String tacoString = String.valueOf(taco); 
        outBundle.putString(SURVEY_KEY, pizzaString, tacoString);
    }
}
