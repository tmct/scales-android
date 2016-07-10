package uk.co.tmmct.scales.services;

import uk.co.tmmct.scales.models.Scale;

/**
 * Created by thomas on 10/07/2016.
 */
public class ScaleGeneratorService {
    public static Scale[] getScales() {
        return new Scale[] {
                new Scale(),
                new Scale(),
                new Scale()
        };
    }
}
