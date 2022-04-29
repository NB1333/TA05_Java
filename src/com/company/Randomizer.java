package com.company;

public class Randomizer {
    //This method adds random elements in the array
    public void randomize(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 50 + 1);
        }
    }
}
