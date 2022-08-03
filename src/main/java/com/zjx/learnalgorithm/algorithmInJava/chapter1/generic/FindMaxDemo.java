package com.zjx.learnalgorithm.algorithmInJava.chapter1.generic;

/**
 * 1.4.3
 * 只有在使用Object类中已有的那些方法能够表示所执行的操作的时候，才能使用Object作为泛型类型来工作。
 * 所以我们有时需要使用接口类型表示泛型：比如通过实现Comparable接口的对象来进行比对
 *
 * 1. 只有实现Comparable接口的对象才能作为Comparable数组的元素被传递。
 * 2. 如果Comparable数组有两个不相容的对象，那么CompareTo方法将抛出异常ClassCaseException，这是我们所期望的
 * 3. 基本类型不能作为Comparable传递，可以使用包装类，因为它们实现了Comparable接口
 * 4. 接口究竟是不是标准的库接口倒不是必须的
 * 5. 有时让一个类实现所需接口是不可能的。比如一个类可能是库中的类，而接口是用户自定义的接口。如果一个类是final类，那么就不可以扩展它以创建一个新的类
 *
 */
public class FindMaxDemo {
    public static Comparable findMax(Comparable[] arr ){
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[maxIndex])>0) {
                maxIndex = i;
            }
        }
        return arr[maxIndex];

    }

    public static void main(String[] args) {
        Integer[] integers = {2, 6, 3, 5, 9, 2, 1};
        String[] strings = {"Joe", "Bob", "Bill","Zeke"};
        System.out.println(findMax(integers));
        System.out.println(findMax(strings));
    }
}
