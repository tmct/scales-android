package uk.co.tmmct.scales.models;

/**
 * Created by thomas on 16/07/16.
 */
public enum Mode {
    MAJOR,
    MINOR,
    HARMONIC_MINOR,
    MELODIC_MINOR,
    CHROMATIC;

    public static Mode[] AllScaleModes = new Mode[] {MAJOR, HARMONIC_MINOR, MELODIC_MINOR};

    public static Mode[] AllArpeggioModes = new Mode[] {MAJOR, MINOR};

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
