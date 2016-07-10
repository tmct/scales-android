package uk.co.tmmct.scales.services;

import uk.co.tmmct.scales.models.Arpeggio;
import uk.co.tmmct.scales.models.Scale;
import uk.co.tmmct.scales.models.SimilarMotionScale;

/**
 * Created by thomas on 10/07/2016.
 */
public class ScaleGeneratorService {
    public static Scale[] getScales() {
        return new Scale[] {
                new SimilarMotionScale(),
                new Arpeggio(),
                new SimilarMotionScale()
        };
    }
}
