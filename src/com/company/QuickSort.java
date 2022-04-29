package com.company;

public class QuickSort {
    private int countOfCompare = 0;
    private int countOfSwaps = 0;

    public void quickSort(int[] array, int low, int high) {
        int temp = 0;
        countOfCompare++;
        if (array.length == 0) {
            return;
        }
        countOfCompare++;
        if (low >= high) {
            return;
        }
 
        int middle = low + (high - low) / 2;
        int key = array[middle];
 
        int i = low;
        int j = high;

        while (i <= j) {
            while (array[i] < key) {
                i++;
                countOfCompare++;
            }
 
            while (array[j] > key) {
                j--;
                countOfCompare++;
            }
 
            if (i <= j) {
                countOfSwaps++;

                temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(array, low, j);
            countOfCompare++;
        }
 
        if (high > i) {
            quickSort(array, i, high);
            countOfCompare++;
        }
    }
    
    public void printResults() {
        System.err.println("Count of swap: " + countOfSwaps);
        System.err.println("Count of compare: " + countOfCompare + "\n");
    }
}
