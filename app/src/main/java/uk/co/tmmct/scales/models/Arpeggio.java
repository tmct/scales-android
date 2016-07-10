package uk.co.tmmct.scales.models;

/**
 * Created by thomas on 10/07/2016.
 */
public class Arpeggio extends Scale {
    public Arpeggio() {
        scaleType = ScaleType.ARPEGGIO;
        key = Key.getRandomKey(true);
    }
}
