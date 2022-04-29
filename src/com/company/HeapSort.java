package com.company;

public class HeapSort {
    private int countOfCompare = 0;
    private int countOfSwaps = 0;

    public void sort(int[] array) {
        int arrayLength = array.length;
        int temp = 0;
        countOfCompare++;
        for (int i = arrayLength / 2 - 1; i >= 0; i--) {
            heapify(array, arrayLength, i);
        }
        countOfCompare++;
        for (int i = arrayLength - 1; i >= 0; i--) {
            countOfSwaps++;

            temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        countOfCompare += 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        countOfCompare += 2;

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        countOfCompare++;

        if (largest != i) {
            countOfSwaps++;

            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapify(array, n, largest);
        }
    }

    public void printResult() {
        System.err.println("Count of swap: " + countOfSwaps);
        System.err.println("Count of compare: " + countOfCompare + "\n");
    }
}
