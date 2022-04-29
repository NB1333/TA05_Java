package com.company;

public class MergeSort {
    private int countOfCompare = 0;
    private int countOfSwap = 0;

    void merge(int[] array, int p, int q, int r) {
        int arr1 = q - p + 1;
        int arr2 = r - q;

        int[] leftArray = new int[arr1];
        int[] rightArray = new int[arr2];

        for (int i = 0; i < arr1; i++)
            leftArray[i] = array[p + i];
        for (int j = 0; j < arr2; j++)
            rightArray[j] = array[q + 1 + j];

        int i = 0, j = 0, k = p;

        while (i < arr1 && j < arr2) {
            countOfCompare += 2;
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                countOfSwap++;
                array[k] = rightArray[j];
                j++;
            }
            k++;

        }

        countOfCompare++;
        while (i < arr1) {
            array[k] = leftArray[i];
            i++;
            k++;

            countOfCompare++;
        }

        countOfCompare++;
        while (j < arr2) {
            array[k] = rightArray[j];
            j++;
            k++;

            countOfCompare++;
        }
    }

    void mergeSort(int[] array, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            mergeSort(array, l, m);
            mergeSort(array, m + 1, r);

            merge(array, l, m, r);
        }
    }

    public void printResult() {
        System.out.println("Count of swaps: " + countOfSwap + "\n");
        System.err.println("Count of compare: " + countOfCompare + "\n");
    }
}
