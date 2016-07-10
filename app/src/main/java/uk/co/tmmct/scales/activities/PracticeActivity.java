package uk.co.tmmct.scales.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import uk.co.tmmct.scales.R;
import uk.co.tmmct.scales.databinding.ActivityPracticeBinding;
import uk.co.tmmct.scales.models.Scale;

public class PracticeActivity extends AppCompatActivity {

    private Scale[] scales;
    private int scaleIndex = 0;
    public Scale scale = new Scale("Chromatic on A");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
        ActivityPracticeBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_practice);
        binding.setScale(scale);
        scales = getScales();
    }

    private Scale[] getScales() {
        return new Scale[]{new Scale("C major")};
    }

    public void goToNextScale(View view) {
        //scale.set(new Scale("Contrary motion!"));
    }
}
