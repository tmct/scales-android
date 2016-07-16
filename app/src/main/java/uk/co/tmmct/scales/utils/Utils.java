package uk.co.tmmct.scales.utils;

import java.util.Random;

/**
 * Created by thomas on 16/07/16.
 */
public class Utils {
    public static <T> T getRandomElement(T[] array) {
        Random rand = new Random();
        int index = rand.nextInt(array.length);
        return array[index];
    }
}
