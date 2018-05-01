package com.timotiusoktorio.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int SCORE_THREE_POINTS = 3;
    private static final int SCORE_TWO_POINTS = 2;
    private static final int SCORE_FREE_THROW = 1;

    private int team_A_score;
    private int team_B_score;

    private TextView team_A_score_text_view;
    private TextView team_B_score_text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        team_A_score_text_view = findViewById(R.id.team_A_score_text_view);
        team_B_score_text_view = findViewById(R.id.team_B_score_text_view);

        resetScores(null);
    }

    public void addScoreForTeamA(View view) {
        incrementScore(view.getId());
        team_A_score_text_view.setText(String.valueOf(team_A_score));
    }

    public void addScoreForTeamB(View view) {
        incrementScore(view.getId());
        team_B_score_text_view.setText(String.valueOf(team_B_score));
    }

    public void resetScores(View view) {
        team_A_score = 0;
        team_B_score = 0;
        team_A_score_text_view.setText(String.valueOf(team_A_score));
        team_B_score_text_view.setText(String.valueOf(team_B_score));
    }

    /**
     * Increment the score for both team_A_score and team_B_score based on the passed button ID.
     * Each button has unique ID which is used to indicate which button is clicked and the points
     * that should be added to either team_A_score or team_B_score variable.
     *
     * @param buttonId - The ID of the clicked button.
     */
    private void incrementScore(int buttonId) {
        switch (buttonId) {
            case R.id.team_A_3_points_button:
                team_A_score += SCORE_THREE_POINTS;
                break;
            case R.id.team_A_2_points_button:
                team_A_score += SCORE_TWO_POINTS;
                break;
            case R.id.team_A_free_throw_button:
                team_A_score += SCORE_FREE_THROW;
                break;
            case R.id.team_B_3_points_button:
                team_B_score += SCORE_THREE_POINTS;
                break;
            case R.id.team_B_2_points_button:
                team_B_score += SCORE_TWO_POINTS;
                break;
            case R.id.team_B_free_throw_button:
                team_B_score += SCORE_FREE_THROW;
                break;
        }
    }
}