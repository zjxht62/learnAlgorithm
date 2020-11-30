package com.zjx.learnalgorithm.GrokkingAlgorithms.chapter5;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;
import java.util.Map;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/1/2
 */
public class PriceOfGroceries {
    public static void main(String[] args) {
        Map<String, Double> book = new HashMap<>();
        //an apple costs 67 cents
        book.put("apple", 0.67);
        //milk costs $1.49
        book.put("milk", 1.49);
        book.put("avocado", 1.49);

        System.out.println(book);
    }
}
