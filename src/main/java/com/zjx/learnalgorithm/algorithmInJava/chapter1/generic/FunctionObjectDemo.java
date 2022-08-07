package com.zjx.learnalgorithm.algorithmInJava.chapter1.generic;

import java.util.Comparator;

/**
 * 函数对象
 * 之前通过实现Comparable接口来实现泛型算法存在一个重要局限：它只对实现Comparable接口的对象有效，因为它使用compareTo作为比较策略的基础。
 * 上述情形的解决方式是重写findMax，使它接受两个参数：一个是对象的数组，另一个是比较函数，该函数解释如何决定两个对象哪个大哪个小。
 * 实际上，这些对象不必再知道如何比较它们自己；这些信息从数组的对象中完全去除了
 * <p>
 * 我们可以定义一个只有方法的类，并传递该类的一个实例。
 * 事实上，一个函数通过将其放在一个对象内部而被传递。这样的对象通常叫做函数对象（function object）
 */

class CaseInsensitiveCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}

public class FunctionObjectDemo {

    public static <AnyType> AnyType findMax(AnyType[] arr, Comparator<? super AnyType> cmp) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (cmp.compare(arr[i], arr[maxIndex]) > 0) {
                maxIndex = i;
            }
        }
        return arr[maxIndex];
    }


    public static void main(String[] args) {
        String[] arr = {"ZEBRA", "alligator", "crocodile"};
        System.out.println(findMax(arr, new CaseInsensitiveCompare()));
    }


}
