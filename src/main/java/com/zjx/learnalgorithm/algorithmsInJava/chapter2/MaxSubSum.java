package com.zjx.learnalgorithm.algorithmsInJava.chapter2;


public class MaxSubSum {
    //O(N^3)
    public static int maxSubSum1(int[] a) {
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int thisSum = 0;
                for (int k = i; k <= j; k++) {
                    thisSum += a[k];
                }
                if (thisSum > maxSum) {
                    maxSum = thisSum;
                }

            }

        }
        return maxSum;
    }

    //O(N^2)
    public static int maxSubSum2(int[] a) {
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            int thisSum = 0;
            for (int j = i; j < a.length; j++) {
                thisSum += a[j];
                if (thisSum > maxSum) {
                    maxSum = thisSum;
                }

            }
        }
        return maxSum;
    }

    //O(NlogN)
    public static int maxSubSum3(int[] a) {
        return maxSumRec(a, 0, a.length - 1);
    }

    private static int maxSumRec(int[] a, int left, int right) {
        if (left == right) {
            if (a[left] > 0) {
                return a[left];
            } else {
                return 0;
            }
        }

        int center = (left + right) / 2;
        int maxLeftSum = maxSumRec(a, left, center);
        int maxRightSum = maxSumRec(a, center + 1, right);

        int maxLeftBorderSum = 0, leftBorderSum = 0;
        for (int i = center; i >= left; i--) {
            leftBorderSum += a[i];
            if (leftBorderSum > maxLeftBorderSum) {
                maxLeftBorderSum = leftBorderSum;
            }
        }

        int maxRightBorderSum = 0, rightBorderSum = 0;
        for (int i = center + 1; i <= right; i++) {
            rightBorderSum += a[i];
            if (rightBorderSum > maxRightBorderSum) {
                maxRightBorderSum = rightBorderSum;
            }

        }

        return max3(maxLeftSum, maxRightSum, maxLeftBorderSum + maxRightBorderSum);


    }

    private static int max3(int a, int b, int c) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (max > c) {
            return max;
        } else {
            return c;
        }

    }

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


    public static void main(String[] args) {
        int[] ints = {3, -4, 1, 7, -2, 5, -6, 4};
        System.out.println(maxSubSum4(ints));
    }
}
