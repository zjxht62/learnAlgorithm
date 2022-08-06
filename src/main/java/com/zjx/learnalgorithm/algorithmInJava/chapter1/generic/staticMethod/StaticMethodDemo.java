package com.zjx.learnalgorithm.algorithmInJava.chapter1.generic.staticMethod;

/**
 * 使用泛型static方法搜索数组
 * 在方法的声明中，有特定类型的参数表
 * 因为：
 * 1. 该特定类型用作返回类型
 * 2. 该类型用在多于一个的参数类型中
 * 3. 该类型用于声明一个局部变量
 * 如果是这样，那么，必须要声明一种带有若干类型参数的显式泛型方法
 *
 * 下面是一种泛型static方法，该方法对于值x在数组arr中进行一系列查找。通过使用一种泛型方法，代替使用Object作为参数的非泛型方法，
 * 当在Shape数组中查找Apple对象时，我们能够得到编译错误
 */
public class StaticMethodDemo {
    public static <AnyType> boolean contains(AnyType[] arr, AnyType x) {
        for (AnyType val : arr) {
            if (x.equals(val)) {
                return true;
            }
        }
        return false;
    }
}
