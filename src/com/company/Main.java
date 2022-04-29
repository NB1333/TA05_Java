package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] firstArray = new int[100_000];
        int[] secondArray = new int[1_000_000];
        int[] thirdArray = firstArray.clone();
        int[] fourthArray = secondArray.clone();

        String ms = "ms \n";

        long startTime;
        long endTime;

        Randomizer rand = new Randomizer();

        SortedArray sorted = new SortedArray();

        QuickSort quick = new QuickSort();

        try {
            System.out.println("\nThis sorting algorythms is for random sorted arrays.\n");

            rand.randomize(firstArray);
            rand.randomize(secondArray);

            //Quick Sort for 100K elements
            startTime = System.currentTimeMillis();
            quick.quickSort(firstArray, 0, firstArray.length - 1);
            endTime = System.currentTimeMillis();
            System.out.println(firstArray.length + " elements was sorted by Quick Sort in " 
                            + (endTime - startTime) + ms);
            quick.printResults();

            //Quick Sort for 1M elements
            startTime = System.currentTimeMillis();
            quick.quickSort(secondArray, 0, secondArray.length - 1);
            endTime = System.currentTimeMillis();
            System.out.println(secondArray.length + " elements was sorted by Quick Sort in " 
                            + (endTime - startTime) + ms);
            quick.printResults();

            rand.randomize(firstArray);
            rand.randomize(secondArray);

            MergeSort merge = new MergeSort();

            //Merge Sort for 100K elements
            startTime = System.currentTimeMillis();
            merge.mergeSort(firstArray, 0, firstArray.length - 1);
            endTime = System.currentTimeMillis();
            System.out.println(firstArray.length + " elements was sorted by Merge Sort in " 
                            + (endTime - startTime) + ms);
            merge.printResult();

            //Merge Sort for 1M elements
            startTime = System.currentTimeMillis();
            merge.mergeSort(secondArray, 0, secondArray.length - 1);
            endTime = System.currentTimeMillis();
            System.out.println(secondArray.length + " elements was sorted by Merge Sort in " 
                            + (endTime - startTime) + ms);
            merge.printResult();

            rand.randomize(firstArray);
            rand.randomize(secondArray);

            ShellSort shell = new ShellSort();

            //Shell Sort for 100K elements
            startTime = System.currentTimeMillis();
            shell.shellSort(firstArray, firstArray.length);
            endTime = System.currentTimeMillis();
            System.out.println(firstArray.length + " elements was sorted by Shell Sort in " 
                            + (endTime - startTime) + ms);
            shell.printResult();

            //Shell Sort for 1M elements
            startTime = System.currentTimeMillis();
            shell.shellSort(secondArray, secondArray.length);
            endTime = System.currentTimeMillis();
            System.out.println(secondArray.length + " elements was sorted by Shell Sort in " 
                            + (endTime - startTime) + ms);
            shell.printResult();

            HeapSort heap = new HeapSort();

            rand.randomize(firstArray);
            rand.randomize(secondArray);

            //Heap Sort for 100K elements
            startTime = System.currentTimeMillis();
            heap.sort(firstArray);
            endTime = System.currentTimeMillis();
            System.out.println(firstArray.length + " elements was sorted by Heap Sort in " 
                            + (endTime - startTime) + ms);
            heap.printResult();
            

            //Heap Sort for 1M elements
            startTime = System.currentTimeMillis();
            heap.sort(secondArray);
            endTime = System.currentTimeMillis();
            System.out.println(secondArray.length + " elements was sorted by Heap Sort in " 
                            + (endTime - startTime) + ms);
            heap.printResult();

            System.out.println("The next sorting result is for already sorted arrays. \n");
            
            //
            //

            sorted.sorted(thirdArray);
            sorted.sorted(fourthArray);

            //Quick Sort for 100K elements
            startTime = System.currentTimeMillis();
            quick.quickSort(thirdArray, 0, thirdArray.length - 1);
            endTime = System.currentTimeMillis();
            System.out.println(thirdArray.length + " elements was sorted by Quick Sort in " 
                            + (endTime - startTime) + ms);
            quick.printResults();

            //Quick Sort for 1M elements
            startTime = System.currentTimeMillis();
            quick.quickSort(fourthArray, 0, fourthArray.length - 1);
            endTime = System.currentTimeMillis();
            System.out.println(fourthArray.length + " elements was sorted by Quick Sort in " 
                            + (endTime - startTime) + ms);
            quick.printResults();
            

            sorted.sorted(thirdArray);
            sorted.sorted(fourthArray);

            //Merge Sort for 100K elements
            startTime = System.currentTimeMillis();
            merge.mergeSort(thirdArray, 0, thirdArray.length - 1);
            endTime = System.currentTimeMillis();
            System.out.println(thirdArray.length + " elements was sorted by Merge Sort in " 
                            + (endTime - startTime) + ms);
            merge.printResult();

            //Merge Sort for 1M elements
            startTime = System.currentTimeMillis();
            merge.mergeSort(fourthArray, 0, fourthArray.length - 1);
            endTime = System.currentTimeMillis();
            System.out.println(fourthArray.length + " elements was sorted by Merge Sort in " 
                            + (endTime - startTime) + ms);
            merge.printResult();

            sorted.sorted(thirdArray);
            sorted.sorted(fourthArray);

            //Shell Sort for 100K elements
            startTime = System.currentTimeMillis();
            shell.shellSort(thirdArray, thirdArray.length);
            endTime = System.currentTimeMillis();
            System.out.println(thirdArray.length + " elements was sorted by Shell Sort in " 
                            + (endTime - startTime) + ms);
            shell.printResult();

            //Shell Sort for 1M elements
            startTime = System.currentTimeMillis();
            shell.shellSort(fourthArray, fourthArray.length);
            endTime = System.currentTimeMillis();
            System.out.println(fourthArray.length + " elements was sorted by Shell Sort in " 
                            + (endTime - startTime) + ms);
            shell.printResult();

            sorted.sorted(thirdArray);
            sorted.sorted(fourthArray);

            //Heap Sort for 100K elements
            startTime = System.currentTimeMillis();
            heap.sort(thirdArray);
            endTime = System.currentTimeMillis();
            System.out.println(thirdArray.length + " elements was sorted by Heap Sort in " 
                            + (endTime - startTime) + ms);
            heap.printResult();

            //Heap Sort for 1M elements
            startTime = System.currentTimeMillis();
            heap.sort(fourthArray);
            endTime = System.currentTimeMillis();
            System.out.println(fourthArray.length + " elements was sorted by Heap Sort in " 
                            + (endTime - startTime) + ms);
            heap.printResult();

        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }


    }
}
