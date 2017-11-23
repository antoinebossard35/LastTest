package com.example.antoine.lasttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);





        final TextView mTextView;
        final Button mPlayButton;
        final Button mPlayButton1;
        final Button mPlayButton2;
        final Button mPlayButton3;



        mTextView = (TextView) findViewById(R.id.activity_game_question_text);
        mPlayButton = (Button) findViewById(R.id.activity_game_answer1_btn);
        mPlayButton1 = (Button) findViewById(R.id.activity_game_answer2_btn);
        mPlayButton2 = (Button) findViewById(R.id.activity_game_answer3_btn);
        mPlayButton3 = (Button) findViewById(R.id.activity_game_answer4_btn);

        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPlayButton.setVisibility(View.GONE);
                mPlayButton1.setVisibility(View.GONE);
                mPlayButton2.setVisibility(View.GONE);
                mPlayButton3.setVisibility(View.GONE);

                mTextView.setText("CONGRATS !!");

            }
        });
        }
    }

