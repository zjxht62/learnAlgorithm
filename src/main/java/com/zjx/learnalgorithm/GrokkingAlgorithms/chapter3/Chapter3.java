package com.zjx.learnalgorithm.GrokkingAlgorithms.chapter3;

import com.sun.org.apache.bcel.internal.generic.NEW;
import sun.print.SunMinMaxPage;

import java.net.CacheRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/12/28
 */
public class Chapter3 {
    public void countdown(int i) {
        System.out.println(i);
        if(i <= 0) {
            //任何声明为void的方法都不会返回值。它不需要包含return语句，
            // 但是可以这样做。在这种情况下，
            // 可以使用return语句从
            // 控制流块中分支出来并退出该方法
            return;
        } else {
            countdown(i - 1);
        }
    }

    public int fact(int x) {
        if (x == 1) {
            return 1;
        } else {
            return fact(x - 1) * x;
        }
    }

    /**
     * 递归求list的sum
     * @param list
     * @return
     */
    public int sum(List<Integer> list) {
        int sum;
        if (list.size() == 0) {
            return 0;
        } else {
            sum = list.get(0) + sum(list.subList(1,list.size()));
        }
        return sum;
    }

    public int size(List<Integer> list) {
        int size;
        if (list.isEmpty()) {
            return 0;
        } else {
            size = 1 + size(list.subList(1, list.size()));
        }
        return size;
    }

    public static int findMax(int[] arr) {
        int max=Max(arr,0,arr.length-1);

        return max;
    }

    public static int Max(int[] arr,int index1,int index2) {
        if (index1 == index2) {
            return arr[index1];
        } else {
            int len = (index1 + index2) / 2;
            int leftMax = Max(arr, index1, len);
            int rightMax = Max(arr, len + 1, index2);

            return leftMax > rightMax ? leftMax : rightMax;
        }

    }

    public static void main(String[] args) {
        Chapter3 chapter3 = new Chapter3();
//        chapter3.countdown(5);
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        System.out.println(chapter3.size(list));


        System.out.println(reverseString("abcdefg"));
        System.out.println(reverseString2("abcdefg"));
        System.out.println(reverseString3("abcdefg"));
        System.out.println(reverseString4("abcdefg"));

    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        String result = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            result += chars[i];
        }
        return result;
    }

    public static String reverseString2(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static String reverseString3(String str) {
        char[] chars = str.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length/2; i++) {
            char temp = chars[i];
            chars[i] =  chars[chars.length -1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        return String.valueOf(chars);
    }

    public static String reverseString4(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0, j = chars.length - 1; i< chars.length/2;i++,j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
