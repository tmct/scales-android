package uk.co.tmmct.scales.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import uk.co.tmmct.scales.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void startPractice(View view) {
        Intent intent = new Intent(this, PracticeActivity.class);
        startActivity(intent);
    }
}
