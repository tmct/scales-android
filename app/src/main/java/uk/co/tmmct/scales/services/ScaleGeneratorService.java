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
                scaleGroups[1].getRandomScale(),
                scaleGroups[2].getRandomScale(),
                scaleGroups[3].getRandomScale(),
                scaleGroups[4].getRandomScale(),
                scaleGroups[5].getRandomScale(),
                scaleGroups[6].getRandomScale(),
                scaleGroups[7].getRandomScale()
        };
    }
}
