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

    private static final String PIZZA_STATE_KEY = "pizza state";
    private static final String TACO_STATE_KEY = "taco state";

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
            // Use the
            pizza = savedInstanceState.getInt(PIZZA_STATE_KEY, 0);
            taco = savedInstanceState.getInt(TACO_STATE_KEY, 0);
        }

  //      if (pizza == 0 && taco == 0){  // two && but you don't need to check this.
        //      You'll always set the text in the labels.
//            taco = 0;    // these statements are not needed
//            pizza = 0;
            String pizzaString = String.valueOf(pizza);
            mPizzaCount.setText(pizzaString);
            String tacoString = String.valueOf(taco);
            mTacoCount.setText(tacoString);
  //      }

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
        // Put each variable in the bundle individually
        // You can save them as int values, don't need to convert
        outBundle.putInt(PIZZA_STATE_KEY, pizza);
        outBundle.putInt(TACO_STATE_KEY, taco);
    }
}
