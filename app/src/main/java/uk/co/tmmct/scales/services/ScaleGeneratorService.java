package uk.co.tmmct.scales.services;

import uk.co.tmmct.scales.models.Scale;
import uk.co.tmmct.scales.models.ScaleGroup;

/**
 * Created by thomas on 10/07/2016.
 */
public class ScaleGeneratorService {
    private static ScaleGroup[] scaleGroups = new ScaleGroup[] {
            new ScaleGroup.ScaleGroupBuilder()
                    .WithHandsTogetherAndSeparately()
                    .Legato()
                    .InEFlatMajor()
                    .Build()
    };

    public static Scale[] getScales() {
        return new Scale[] {
                scaleGroups[0].getRandomScale()
        };
    }
}
