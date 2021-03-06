package com.example.promob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class quiz2 extends AppCompatActivity implements View.OnClickListener {

    private Button trueButton;
    private Button falseButton;
    private TextView questionTextView;
    private ImageButton prevButton;
    private ImageButton nextButton;

    private int currentQuestionIndex = 0;


    private Question[] questionBank = new Question[]{
            new Question(R.string.q2_1, true),
            new Question(R.string.q2_2, false),
            new Question(R.string.q2_3, false),
            new Question(R.string.q2_4, true),
            new Question(R.string.q2_5, true),
            new Question(R.string.q2_6, false),
            new Question(R.string.q2_7, true),
            new Question(R.string.q2_8, true),
            new Question(R.string.q2_9, false),
            new Question(R.string.q2_10, true)

    };

    private Button btnbalik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        falseButton = findViewById(R.id.false_button);
        trueButton = findViewById(R.id.ture_buttoon);
        questionTextView = findViewById(R.id.answer_text_view);
        prevButton = findViewById(R.id.prev_button);
        nextButton = findViewById(R.id.next_button);
        btnbalik = findViewById(R.id.btnbalik);


        trueButton.setOnClickListener(this);
        falseButton.setOnClickListener(this);
        prevButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
        btnbalik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(quiz2.this,kls2.class);
                startActivity(move);
            }
        });

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ture_buttoon:
                checkAnswer(true);
                break;

            case R.id.false_button:
                checkAnswer(false);
                break;

            case R.id.next_button:
                currentQuestionIndex = (currentQuestionIndex + 1) % questionBank.length;
                updateQuestion();
                break;

            case R.id.prev_button:
                if (currentQuestionIndex > 0) {
                    currentQuestionIndex = (currentQuestionIndex - 1) % questionBank.length;
                    updateQuestion();
                }
        }
    }

    private void updateQuestion() {
        Log.d("Current", "Onclick" + currentQuestionIndex);
        questionTextView.setText(questionBank[currentQuestionIndex].getAnswerResId());
    }

    private void checkAnswer(boolean userChoosenCorrect) {
        boolean answerIsTrue = questionBank[currentQuestionIndex].isAnswerTrue();

        int toastMessageId = 0;
        if (userChoosenCorrect == answerIsTrue) {
            toastMessageId = R.string.correct_answer;
        } else {
            toastMessageId = R.string.wrong_answer;
        }
        Toast.makeText(quiz2.this, toastMessageId, Toast.LENGTH_SHORT).show();
    }
}