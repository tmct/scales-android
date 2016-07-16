package uk.co.tmmct.scales.models;

/**
 * Created by thomas on 16/07/16.
 */
public enum Hands {
    TOGETHER,
    LEFT_ONLY,
    RIGHT_ONLY,
    NOT_APPLICABLE;

    public static Hands[] Separately = new Hands[] {LEFT_ONLY, RIGHT_ONLY};
}
