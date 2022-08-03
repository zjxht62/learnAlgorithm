package com.zjx.learnalgorithm.algorithmInJava.chapter1.generic;

/**
 * 1.4.2
 * 为了解决已有一种类型的对象，可是语言需要一种不同类型的对象的问题
 * 我们使用包装类
 * 虽然每一个引用类型都和Object相容，但是8种基本类型却不能。所以Java为了这8种基本类型提供了包装类。
 * 每一个包装对象都是不可变的，它存储一种当该对象被构建时所设置的原值，并提供一种方法以重新得到该值。
 */
public class WrapperDemo {
    public static void main(String[] args) {
        MemoryCell m = new MemoryCell();
        m.write(new Integer(37));
        Integer wrapperVal = (Integer) m.read();
        int val = wrapperVal.intValue();
        System.out.println("Contents are:" + val);
    }
}
