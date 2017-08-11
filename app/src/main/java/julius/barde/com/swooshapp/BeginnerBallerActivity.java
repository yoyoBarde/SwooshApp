package julius.barde.com.swooshapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BeginnerBallerActivity extends AppCompatActivity {
Button myNext_btn;
    public static final String SKILL_TYPE_HOLDER = "skill_type_sent";
public String SkillType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_baller);
        findViews();


    }

    private void findViews() {
        myNext_btn= (Button) (findViewById(R.id.next_btn));

    }

    public void baller(View view) {
        myNext_btn.setAlpha(0.99f);
        myNext_btn.setEnabled(true);
        SkillType="Baller";
    }

    public void beginner(View view) {
        myNext_btn.setAlpha(0.99f);
        myNext_btn.setEnabled(true);
        SkillType="Beginner";
    }

    public void next(View view) {

        Intent myIntent = new Intent();
        myIntent.putExtra(SKILL_TYPE_HOLDER,SkillType);
        setResult(Activity.RESULT_OK,myIntent);
        finish();
    }
}
