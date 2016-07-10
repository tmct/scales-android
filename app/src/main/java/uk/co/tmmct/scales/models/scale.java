package uk.co.tmmct.scales.models;

/**
 * Created by thomas on 09/07/2016.
 */
public class Scale {
    public String description;

    public Scale(String description) {
        this.description = description;
    }

    public Key key;

    protected String scaleType = ScaleType.SIMILAR_MOTION;

    public String getDescription() {
        return String.format("%s, %s, legato, hands together", key.getName(), scaleType);
    }

    public Scale() {
        key = Key.getRandomKey();
    }
}
