package julius.barde.com.swooshapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class LeagueActivityy extends AppCompatActivity {
    Button myBtnStart,mens,womens,coeds;
    TextView myText1,myText2;
    String league;
    public static final int REQ_CODE = 1111;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_league_activityy);
        findViews();
    }


    private void findViews() {
        myBtnStart = (Button) findViewById(R.id.buttonStart);
        mens = (Button) findViewById(R.id.mens_btn);
        womens = (Button) findViewById(R.id.womens_btn);
        coeds = (Button) findViewById(R.id.coed_btn);
        myText1 = (TextView) findViewById(R.id.iam_tv);
        myText2 = (TextView) findViewById(R.id.baller_tv);
    }

    public void mens(View view) {
        mens.setAlpha(1f);
        myBtnStart.setAlpha(0.99f);
        myBtnStart.setEnabled(true);
        womens.setAlpha(.50f);
        coeds.setAlpha(.50f);
        league="mens";
    }

    public void womens(View view) {
        womens.setAlpha(1f);
        myBtnStart.setAlpha(0.99f);
        myBtnStart.setEnabled(true);
        mens.setAlpha(.50f);
        coeds.setAlpha(.50f);
        league="womens";

    }

    public void coeds(View view) {
        coeds.setAlpha(1f);
        myBtnStart.setAlpha(0.99f);
        myBtnStart.setEnabled(true);
        womens.setAlpha(.50f);
        mens.setAlpha(.50f);
        league="coeds";
    }

    public void next(View view) {
        Intent myIntent = new Intent(this,BeginnerBallerActivity.class);
        startActivityForResult(myIntent, REQ_CODE);

        }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            if (requestCode == REQ_CODE) {
                String receivedSkillType = data.getStringExtra(BeginnerBallerActivity.SKILL_TYPE_HOLDER);
                myText2.setText(receivedSkillType);
                myText1.setVisibility(View.VISIBLE);
                myText2.setVisibility(View.VISIBLE);
                if(league.equals("mens")) {
                    womens.setEnabled(false);
                    coeds.setEnabled(false);
                }
               else if(league.equals("womens")) {
                    mens.setEnabled(false);
                    coeds.setEnabled(false);
                }
               else if(league.equals("coeds")) {
                    womens.setEnabled(false);
                    mens.setEnabled(false);
                }
            }
        }
    }
}

