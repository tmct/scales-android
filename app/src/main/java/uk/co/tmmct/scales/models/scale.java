package uk.co.tmmct.scales.models;

import android.databinding.ObservableField;

/**
 * Created by thomas on 09/07/2016.
 */
public class Scale {
    public final ObservableField<String> description =
            new ObservableField<>();

    public Scale(String description) {
        this.description.set(description);
    }
}
