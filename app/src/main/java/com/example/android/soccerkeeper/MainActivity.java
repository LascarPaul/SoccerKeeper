package com.example.android.soccerkeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    int yellowCardA = 0;
    int yellowCardB = 0;

    int redCardA = 0;
    int redCardB = 0;

    int penaltyKicksA = 0;
    int penaltyKicksB = 0;

    int cornersA = 0;
    int cornersB = 0;

    int freeKicksA = 0;
    int freeKicksB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    public void displayYellowCardA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_card_team_A);
        scoreView.setText(String.valueOf(score));

    }

    public void displayYellowCardB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_card_team_B);
        scoreView.setText(String.valueOf(score));

    }

    public void displayRedCardA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_card_team_A);
        scoreView.setText(String.valueOf(score));

    }

    public void displayRedCardB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_card_team_B);
        scoreView.setText(String.valueOf(score));

    }

    public void displayPenaltyA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.penalty_A);
        scoreView.setText(String.valueOf("Penalty : " + score));

    }

    public void displayPenaltyB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.penalty_B);
        scoreView.setText(String.valueOf("Penalty : " + score));

    }

    public void displayCornersA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.corners_A);
        scoreView.setText(String.valueOf("Corners : " + score));

    }

    public void displayCornersB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.corners_B);
        scoreView.setText(String.valueOf("Corners : " + score));

    }

    public void displayFreeKicksA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.freekicks_A);
        scoreView.setText(String.valueOf("Free Kicks: " + score));

    }

    public void displayFreeKicksB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.freekicks_B);
        scoreView.setText(String.valueOf("Free Kicks: " + score));

    }


    public void incrementFkA(View view) {
        freeKicksA++;
        displayFreeKicksA(freeKicksA);
    }

    public void decrementFkA(View view) {
        freeKicksA--;
        displayFreeKicksA(freeKicksA);
    }

    public void changeFkA(View view, int value){
        freeKicksA += value;
        displayFreeKicksA(freeKicksA
        );
    }

    public void incrementFkB(View view) {
        freeKicksB++;
        displayFreeKicksB(freeKicksB);
    }

    public void decrementFkB(View view) {
        freeKicksB--;
        displayFreeKicksB(freeKicksB);
    }


    public void incrementCornersA(View view){
        cornersA++;
        displayCornersA(cornersA);
    }

    public void decrementCornersA(View view) {
        cornersA--;
        displayCornersA(cornersA);
    }

    public void incrementCornersB(View view) {
        cornersB++;
        displayCornersB(cornersB);
    }

    public void decrementCornersB(View view) {
        cornersB--;
        displayCornersB(cornersB);
    }


    public void incrementPenaltyA(View view) {
        penaltyKicksA++;
        displayPenaltyA(penaltyKicksA);
    }

    public void decrementPenaltyA(View view) {
        penaltyKicksA--;
        displayPenaltyA(penaltyKicksA);
    }

    public void incrementPenaltyB(View view) {
        penaltyKicksB++;
        displayPenaltyB(penaltyKicksB);
    }

    public void decrementPenaltyB(View view) {
        penaltyKicksB--;
        displayPenaltyB(penaltyKicksB);
    }


    public void incrementYellowA(View view) {
        yellowCardA++;
        displayYellowCardA(yellowCardA);
    }

    public void decrementYellowA(View view) {
        yellowCardA--;
        displayYellowCardA(yellowCardA);
    }

    public void incrementRedA(View view) {
        redCardA++;
        displayRedCardA(redCardA);
    }

    public void decrementRedA(View view) {
        redCardA--;
        displayRedCardA(redCardA);
    }

    public void incrementYellowB(View view) {
        yellowCardB++;
        displayYellowCardB(yellowCardB);
    }

    public void decrementYellowB(View view) {
        yellowCardB--;
        displayYellowCardB(yellowCardB);
    }

    public void incrementRedB(View view) {
        redCardB++;
        displayRedCardB(redCardB);
    }

    public void decrementRedB(View view) {
        redCardB--;
        displayRedCardB(redCardB);
    }

    public void incrementTeamB(View view) {
        teamBScore++;
        displayForTeamB(teamBScore);
    }

    public void incrementTeamA(View view) {
        teamAScore++;
        displayForTeamA(teamAScore);
    }

    public void decrementTeamB(View view) {
        teamBScore--;
        displayForTeamB(teamBScore);
    }

    public void decrementTeamA(View view) {
        teamAScore--;
        displayForTeamA(teamAScore);
    }

    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;

        yellowCardA = 0;
        yellowCardB = 0;

        redCardA = 0;
        redCardB = 0;

        penaltyKicksA = 0;
        penaltyKicksB = 0;

        cornersA = 0;
        cornersB = 0;

        freeKicksA = 0;
        freeKicksB = 0;

        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);

        displayYellowCardA(yellowCardA);
        displayYellowCardB(yellowCardB);

        displayRedCardA(redCardA);
        displayRedCardB(redCardB);

        displayPenaltyA(penaltyKicksA);
        displayPenaltyB(penaltyKicksB);

        displayCornersA(cornersA);
        displayCornersB(cornersB);

        displayFreeKicksA(freeKicksA);
        displayFreeKicksB(freeKicksB);
    }
}
