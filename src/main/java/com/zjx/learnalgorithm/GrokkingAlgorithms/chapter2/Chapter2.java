package com.zjx.learnalgorithm.GrokkingAlgorithms.chapter2;



/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/12/27
 */
public class Chapter2 {
    public int findSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public int[] selectionSort(int[] array) {
        int[] resultArray = new int[10];
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = findSmallest(array);
            resultArray[i] = array[smallestIndex];
        }
        return resultArray;

    }

    public static void main(String[] args) {
        Chapter2 chapter2 = new Chapter2();
        int[] array = {1, 3, 9, 5, 2};
        System.out.println(chapter2.findSmallest(array));
        int[] resultArray = chapter2.selectionSort(array);
        for (int i : resultArray) {
            System.out.print(i + " ");
        }
    }
}
