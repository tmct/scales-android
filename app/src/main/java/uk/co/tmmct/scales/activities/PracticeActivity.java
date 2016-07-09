package uk.co.tmmct.scales.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import uk.co.tmmct.scales.R;
import uk.co.tmmct.scales.models.Scale;

public class PracticeActivity extends AppCompatActivity {

    private Scale[] scales;
    private int scaleIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
        scales = getScales();
    }

    private Scale[] getScales() {
        return new Scale[]{new Scale("C major")};
    }
}
