package julius.barde.com.swooshapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void getStarted(View view){

        Intent myIntent = new Intent(this,LeagueActivityy.class);
        startActivity(myIntent);

    }
}
