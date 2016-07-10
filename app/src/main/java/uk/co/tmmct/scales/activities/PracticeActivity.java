package uk.co.tmmct.scales.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import uk.co.tmmct.scales.R;
import uk.co.tmmct.scales.databinding.ActivityPracticeBinding;
import uk.co.tmmct.scales.models.Scale;
import uk.co.tmmct.scales.services.ScaleGeneratorService;
import uk.co.tmmct.scales.viewmodels.Practice;

public class PracticeActivity extends AppCompatActivity {

    private Practice practice;
    private Scale[] scales;
    private int scaleIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
        ActivityPracticeBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_practice);
        practice = new Practice();
        scales = ScaleGeneratorService.getScales();
        updatePractice();
        binding.setPractice(practice);
    }

    private void updatePractice() {
        practice.scaleDescription.set(getCurrentScale().getDescription());
        String numberDesc = String.format("Scale %s of %s", scaleIndex + 1, scales.length);
        practice.scaleNumberDescription.set(numberDesc);
    }

    public void goToNextScale(View view) {
        if (scaleIndex >= scales.length - 1) {
            finish();
            return;
        }
        scaleIndex++;
        updatePractice();
        if (scaleIndex == scales.length - 1) {
            Button button = (Button) view;
            button.setText("Done!");
        }
    }

    private Scale getCurrentScale() {
        return scales[scaleIndex];
    }
}
