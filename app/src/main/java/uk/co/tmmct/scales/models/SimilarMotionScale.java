package uk.co.tmmct.scales.models;

/**
 * Created by thomas on 10/07/2016.
 */
public class SimilarMotionScale extends Scale {

    public SimilarMotionScale() {
        scaleType = ScaleType.SIMILAR_MOTION;
        key = Key.getRandomKey(false);
    }
}
