package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView storyTextView;
    private Button topButton;
    private Button bottomButton;

    private int progress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storyTextView = (TextView) findViewById(R.id.storyTextView);
        topButton = (Button) findViewById(R.id.buttonTop);
        bottomButton = (Button) findViewById(R.id.buttonBottom);

        progress = R.string.T1_Story;

    }

    public void topButtonClicked(View view) {
        if (progress == R.string.T1_Story || progress == R.string.T2_Story) {
            // next s3
            storyTextView.setText(R.string.T3_Story);
            topButton.setText(R.string.T3_Ans1);
            bottomButton.setText(R.string.T3_Ans2);
            progress = R.string.T3_Story;
        } else if (progress == R.string.T3_Story) {
            // next e6
            storyTextView.setText(R.string.T6_End);
            topButton.setVisibility(View.GONE);
            bottomButton.setVisibility(View.GONE);
            progress = R.string.T6_End;
        } else {
            finish();
        }

    }

    public void bottomButtonClicked(View view) {
        if (progress == R.string.T1_Story) {
            // next s2
            storyTextView.setText(R.string.T2_Story);
            topButton.setText(R.string.T2_Ans1);
            bottomButton.setText(R.string.T2_Ans2);
            progress = R.string.T2_Story;
        } else if (progress == R.string.T3_Story) {
            // next e5
            storyTextView.setText(R.string.T5_End);
            topButton.setVisibility(View.GONE);
            bottomButton.setVisibility(View.GONE);
            progress = R.string.T5_End;
        } else if (progress == R.string.T2_Story) {
            // next e4
            storyTextView.setText(R.string.T4_End);
            topButton.setVisibility(View.GONE);
            bottomButton.setVisibility(View.GONE);
            progress = R.string.T4_End;
        } else {
            finish();
        }
    }
}
