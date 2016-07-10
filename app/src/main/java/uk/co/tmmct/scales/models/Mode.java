package uk.co.tmmct.scales.models;

import java.util.Random;

/**
 * Created by thomas on 10/07/2016.
 */
public class Mode {
    private int index;

    public Mode(int index) {
        this.index = index;
    }

    public static Mode getRandomMode() {
        Random rand = new Random();
        int modeValue = rand.nextInt(3);
        return new Mode(modeValue);
    }

    public String getName() {
        return modeNames[index];
    }

    private final String[] modeNames = new String[] {
        "major",
        "minor (harmonic)",
        "minor (melodic)"
    };
}