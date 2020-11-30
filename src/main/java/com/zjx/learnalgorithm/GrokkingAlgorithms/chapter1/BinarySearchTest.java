package com.zjx.learnalgorithm.GrokkingAlgorithms.chapter1;

import java.util.List;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/12/27
 */
public class BinarySearchTest {
    public int binarySearch(int[] list, int item) {
        int low = 0; //low和high用于跟踪要在其中查找的部分
        int high = list.length - 1;
        while (low <= high) {  //只要范围没有缩小到只包含一个元素
            int mid = (low + high) / 2; //就检查中间元素
            int guess = list[mid];
            if (guess == item) {   //找到元素
                return mid;
            } else if (guess > item) {  //猜的数字大了  那就把high设置为mid - 1
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; //没有找到元素
    }



    public static void main(String[] args) {
        BinarySearchTest binarySearchTest = new BinarySearchTest();
        int[] list = {1, 2, 4, 7, 9, 10, 15, 19};
        System.out.println(binarySearchTest.binarySearch(list, 9));
    }

}
