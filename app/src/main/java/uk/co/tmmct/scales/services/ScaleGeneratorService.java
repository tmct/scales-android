package uk.co.tmmct.scales.services;

import uk.co.tmmct.scales.models.GradeVI;
import uk.co.tmmct.scales.models.Scale;
import uk.co.tmmct.scales.models.ScaleGroup;

/**
 * Created by thomas on 10/07/2016.
 */
public class ScaleGeneratorService {

    private static final ScaleGroup[] scaleGroups = GradeVI.getScaleGroups();

    public static Scale[] getScales() {
        return new Scale[]{
                scaleGroups[0].getRandomScale(),
                scaleGroups[1].getRandomScale()
        };
    }
}
