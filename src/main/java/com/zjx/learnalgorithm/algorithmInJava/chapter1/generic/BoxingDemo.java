package com.zjx.learnalgorithm.algorithmInJava.chapter1.generic;

/**
 * 1.5.2
 * 自动装箱/拆箱
 * 自动装箱：如果一个int型变量被传递到一个需要Integer对象的地方，那么编译器会自动在幕后插入一个对Integer构造方法的调用。
 * 自动拆箱：如果一个Integer对象被放到需要int型的地方，那么编译器会在幕后插入一个对intValue方法的调用。
 *
 * 1.5.3
 * 菱形运算符
 * 既然m是 GenericMemoryCell<Integer>类型的，那么创建的对象必须也是 GenericMemoryCell<Integer>类型的，任何其他类型的参数都会导致编译错误。
 * 在Java7之后，引入了一种新的语言特性，称为菱形运算符，可以简化代码：
 * GenericMemoryCell<Integer> m = new GenericMemoryCell<>();
 */
public class BoxingDemo {
    public static void main(String[] args) {
        GenericMemoryCell<Integer> m = new GenericMemoryCell<>();
        //自动装箱
        m.write(37);
        //自动拆箱
        int val = m.read();
        System.out.println("Contents are:" + val);
    }
}
