package com.zjx.learnalgorithm.chapter1;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/3/22
 */
public class gcd {
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        System.out.println("最大公约数" + gcd(15750, 27216));
    }
}
