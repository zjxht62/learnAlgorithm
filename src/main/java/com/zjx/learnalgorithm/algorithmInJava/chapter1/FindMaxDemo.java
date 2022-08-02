package com.zjx.learnalgorithm.algorithmInJava.chapter1;

public class FindMaxDemo {
    public static Comparable findMax(Comparable[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[maxIndex]) > 0) {
                maxIndex = i;
            }
        }
        return arr[maxIndex];
    }


    public static void main(String[] args) {
        Integer[] ints = {5,3,6,2,7,9,1};
        System.out.println(findMax(ints));
    }
}
