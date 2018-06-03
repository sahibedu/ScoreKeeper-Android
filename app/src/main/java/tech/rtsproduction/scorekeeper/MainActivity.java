package tech.rtsproduction.scorekeeper;

import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer scoreA=0;
    Integer scoreB=0;
    private TextView scoreForA;
    private TextView scoreForB;
    private Button threeA;
    private Button twoA;
    private Button oneA;
    private Button threeB;
    private Button twoB;
    private Button oneB;
    private Button resetBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //FindViewById For A
        scoreForA = findViewById(R.id.scoreViewA);
        threeA = findViewById(R.id.threeForA);
        twoA = findViewById(R.id.twoForA);
        oneA = findViewById(R.id.oneForA);
    //FindViewById For B
        scoreForB = findViewById(R.id.scoreViewB);
        threeB = findViewById(R.id.threeForB);
        twoB = findViewById(R.id.twoForB);
        oneB = findViewById(R.id.oneForB);

        resetBtn = findViewById(R.id.resetBtn);
        //Team A Button SetOnClickListener
        threeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA+=3;
                displayScoreA();
            }
        });
        twoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA+=2;
                displayScoreA();
            }
        });
        oneA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA++;
                displayScoreA();
            }
        });
        //Team B Button SetOnClickListener
        threeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB+=3;
                displayScoreB();
            }
        });
        twoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB+=2;
                displayScoreB();
            }
        });
        oneB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB++;
                displayScoreB();
            }
        });
        //Reset Button SetonClickListener
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA = 0;
                scoreB = 0;
                displayScoreA();
                displayScoreB();
            }
        });
        //OnClickListener Ends Here
    }
//Methods For Displaying Scores
    void displayScoreA(){
        scoreForA.setText(String.valueOf(scoreA));
    }
    void displayScoreB(){
        scoreForB.setText(String.valueOf(scoreB));
    }
}
