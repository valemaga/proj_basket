package android.example.com;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int firstTeamScore;
    int secondTeamScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstTeamScore = 0;
        secondTeamScore = 0;
    }

    public void addToTeamA(View view){
        int idButton = view.getId();

        switch (idButton) {
            case (R.id.plus_three):
                firstTeamScore += 3;
                break;
            case (R.id.plus_two):
                firstTeamScore += 2;
                break;
            case (R.id.plus_one):
                firstTeamScore += 1;
                break;
        }
        updateTeamAScore(firstTeamScore);
    }

    public void addToTeamB(View view){
        int idButton = view.getId();

        switch (idButton) {
            case (R.id.plus_three_b):
                secondTeamScore += 3;
                break;
            case (R.id.plus_two_b):
                secondTeamScore += 2;
                break;
            case (R.id.plus_one_b):
                secondTeamScore += 1;
                break;
        }
        updateTeamBScore(secondTeamScore);
    }

    public void updateTeamAScore(int score){
        TextView teamAScore = (TextView) findViewById(R.id.team_a_score);
        teamAScore.setText(String.valueOf(score));
    }

    public void updateTeamBScore(int score){
        TextView teamBScore = (TextView) findViewById(R.id.team_b_score);
        teamBScore.setText(String.valueOf(score));
    }
}