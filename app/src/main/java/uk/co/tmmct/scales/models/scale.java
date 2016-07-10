package uk.co.tmmct.scales.models;

/**
 * Created by thomas on 09/07/2016.
 */
public abstract class Scale {
    public Key key;

    protected String scaleType;

    public String getDescription() {
        return String.format("%s, %s, legato, hands together", key.getName(), scaleType);
    }

    public Scale() {}
}
