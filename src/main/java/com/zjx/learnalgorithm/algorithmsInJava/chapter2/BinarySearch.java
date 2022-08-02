package com.zjx.learnalgorithm.algorithmsInJava.chapter2;

public class BinarySearch {

    public static <AnyType extends Comparable<? super AnyType>> int binarySearch(AnyType[] a, AnyType x) {
        int low = 0, high = a.length - 1;
        //有时查找到最后正好l=h
        while (low<=high){
            int mid = (low + high)/2;
            if (x.compareTo(a[mid])>0) {
                low = mid +1;
            }else if (x.compareTo(a[mid])<0){
                high = mid -1;
            } else {
                return mid;
            }
        }
    return -1;
    }


    public static void main(String[] args) {
        Integer[] integers = {2, 5, 7, 8, 9, 23, 46, 67};
        int result = binarySearch(integers, 6);
        System.out.println(result);

    }
}
