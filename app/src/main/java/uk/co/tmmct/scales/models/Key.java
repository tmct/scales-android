package uk.co.tmmct.scales.models;

/**
 * Created by thomas on 10/07/2016.
 */
public class Key {
    public Note tonic;
    public Mode mode;

    public Key(Note tonic, Mode mode) {
        this.tonic = tonic;
        this.mode = mode;
    }

    public static Key getRandomKey() {
        return new Key(Note.getRandomNote(), Mode.getRandomMode());
    }

    public String getName() {
        return tonic.getName() + " " + mode.getName();
    }
}
