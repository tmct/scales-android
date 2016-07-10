package uk.co.tmmct.scales.viewmodels;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

import uk.co.tmmct.scales.models.Scale;

/**
 * Created by thomas on 10/07/2016.
 */
public class Practice {
    public final ObservableField<String> scaleDescription =
            new ObservableField<>();

    public final ObservableInt scaleNumber = new ObservableInt(0);
}
