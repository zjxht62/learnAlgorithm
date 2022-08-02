package com.zjx.learnalgorithm.GrokkingAlgorithms.chapter5;


import java.util.HashMap;
import java.util.Map;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/1/2
 */
public class CheckVoter {
    private static Map<String, Boolean> voted = new HashMap<>();

    private static void checkVoter(String name) {
        if (voted.containsKey(name)) {
            System.out.println("kick them out!");
        } else {
            voted.put(name, true);
            System.out.println("let them vote!");
        }
    }
    public static void main(String[] args) {
        checkVoter("tom");
        checkVoter("mike");
        checkVoter("mike");
    }

}

