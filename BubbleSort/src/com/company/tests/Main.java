package com.company.tests;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	int[] array = new int[10];
        for (int i = 0; i<array.length; i++){
            array[i] = new Random().nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] sortedArray = bubbleSort(array);
        for (int i = 0; i<sortedArray.length; i++){
            System.out.print(sortedArray[i] + " ");
        }
    }

    private static int[] bubbleSort(int [] unsorted){
        for (int i = 1; i < unsorted.length -1; i++){
            for (int j = 1; j < unsorted.length - i; j ++){
                if (unsorted[j]> unsorted[j+1]){
                    int tmp = unsorted [j+1];
                    unsorted[j+1] = unsorted [j];
                    unsorted[j] = tmp;
                } else if (unsorted[j] == unsorted[j+1]){
                    continue;
                }
            }
        }
        return unsorted;
    }
}
