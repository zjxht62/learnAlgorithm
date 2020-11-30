package com.zjx.learnalgorithm.chapter1;

import java.security.PublicKey;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/4/9
 */
public class StaticMethod {
    public static boolean isPrime(int N) {
        if (N < 2) {
            return false;
        }
        for (int i = 2; i*i <= N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void printOut(int n) {
        if (n >= 10) {
            printOut(n / 10);
        }
        System.out.print(n % 10);
    }

    public static void main(String[] args) {
        int[] a = {-2, 11, -4, 13, -5, -2};
        System.out.println(newMaxSubSuml(a));
    }

    public static int maxSubSuml(int[] a) {
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

    public static int newMaxSubSuml(int[] a) {
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

}
