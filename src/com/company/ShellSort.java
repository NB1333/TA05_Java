package com.company;

public class ShellSort {  
    private int countOfSwaps = 0;
    private int countOfCompare = 0;

    void shellSort(int[] array, int n) {
        int key = 0;
        int j = 0;
        
        for (int step = n / 2; step > 0; step /= 2) {
            for (int i = step; i < n; i += 1) {
                key = array[i];

                countOfCompare++;
                
                for (j = i; j >= step && array[j - step] > key; j -= step) {
                    array[j] = array[j - step];
                    countOfCompare += 2;
                    countOfSwaps++;
                }
                array[j] = key;
            }
        }
    }

    public void printResult() {
        System.err.println("Count of swap: " + countOfSwaps);
        System.err.println("Count of compare: " + countOfCompare + "\n");
    }
}
