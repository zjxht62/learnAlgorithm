package com.zjx.learnalgorithm.demos.question_20;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/11/18
 */
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        LinkedList<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.addLast(c);
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                char c1 = stack.removeLast();
                if (getMatch(c1) == c) {
                    continue;
                } else {
                    return false;
                }
            }

        }
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }


    }

    public char getMatch(char c) {
        if (c == '(') {
            return ')';
        } else if (c == '[') {
            return ']';
        } else {
            return '}';
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("[{}()]"));
    }

}
