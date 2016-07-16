package uk.co.tmmct.scales.models;

/**
 * Created by thomas on 10/07/2016.
 */
public class Key {
    public Mode mode;
    public Note tonic;

    public Key(Note tonic, Mode mode) {
        this.tonic = tonic;
        this.mode = mode;
    }
}
