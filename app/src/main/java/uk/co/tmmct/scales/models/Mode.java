package uk.co.tmmct.scales.models;

import java.util.Random;

/**
 * Created by thomas on 10/07/2016.
 */
public class Mode {
    public String name;

    public Mode(String name) {
        this.name = name;
    }

    public static Mode getRandomMode(boolean isArpeggio) {
        String[] modeNames = isArpeggio ? arpeggioModeNames : scaleModeNames;
        String name = getRandomName(modeNames);
        return new Mode(name);
    }

    private static String getRandomName(String[] collection) {
        Random rand = new Random();
        return collection[rand.nextInt(collection.length)];
    }

    private static final String[] scaleModeNames = new String[] {
            "major",
            "minor (harmonic)",
            "minor (melodic)"
    };

    private static final String[] arpeggioModeNames = new String[] {
            "major",
            "minor"
    };
}