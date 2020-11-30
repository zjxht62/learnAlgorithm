package com.zjx.learnalgorithm.chapter1;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/4/9
 */
public class ArrayTest {
    public static void main(String[] args) {
        double[] a = {0.1, 0.2, 0.3, 0.4, 0.5};

        //求数组中最大值
        double max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("数组中最大的值为" + max);

        //求数组平均值
        int length = a.length;
        double sum = 0.0;
        for (int i = 0; i < length; i++) {
            sum += a[i];
        }
        double average = sum/length;
        System.out.println("数组平均值为" + average);

        //复制数组
        double[] doubles = new double[length];
        for (int i = 0; i < length; i++) {
            doubles[i] = a[i];
        }

        //颠倒数组顺序
        for (int i = 0; i < length / 2; i++) {
            double temp = a[i];
            a[i] = a[length - 1 - i];
            a[length - 1 - i] = temp;

        }

        for (int i = 0; i < length; i ++) {
            System.out.print(a[i] + " ");
        }

    }
}
