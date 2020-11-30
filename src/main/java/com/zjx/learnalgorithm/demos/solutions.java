package com.zjx.learnalgorithm.demos;

import java.util.LinkedList;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/11/17
 */
public class solutions {
    public int remove(int[] ints) {
        if (ints.length==0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < ints.length; j++) {
            if (ints[i] != ints[j]) {
                i++;
                ints[i] = ints[j];
            }
        }
        return i + 1;
    }

}
