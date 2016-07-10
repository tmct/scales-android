package uk.co.tmmct.scales.models;

import java.util.Random;

/**
 * Created by thomas on 10/07/2016.
 */
public class Note {
    private int index;

    public Note(int index) {
        this.index = index;
    }

    public static Note getRandomNote() {
        Random rand = new Random();
        int noteValue = rand.nextInt(12);
        return new Note(noteValue);
    }

    public String getName() {
        return noteNames[index];
    }

    private final String[] noteNames = new String[] {
        "A",
        "B♭",
        "B",
        "C",
        "C♯",
        "D",
        "E♭",
        "E",
        "F",
        "F♯",
        "G",
        "G♯"
    };
}
