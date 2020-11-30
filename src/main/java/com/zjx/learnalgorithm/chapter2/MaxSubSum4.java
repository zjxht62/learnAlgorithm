package com.zjx.learnalgorithm.chapter2;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/4/22
 */
public class MaxSubSum4 {
    public static int maxSubSum4(int[] a) {
        int maxSum = 0, thisSum = 0;
        for (int j = 0; j < a.length; j++) {
            thisSum += a[j];

            if (thisSum > maxSum) {
                maxSum = thisSum;
            } else if (thisSum < 0) {
                thisSum = 0;
            }
        }
        return maxSum;
    }
}
