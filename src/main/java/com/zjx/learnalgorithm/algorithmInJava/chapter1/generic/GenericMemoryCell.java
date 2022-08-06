package com.zjx.learnalgorithm.algorithmInJava.chapter1.generic;

/**
 * 1.5.1
 * 简单的泛型类和接口
 * @param <AnyType>
 */

//在类声明的时候，类名后面包含一个或多个类型参数
public class GenericMemoryCell<AnyType> {
    private AnyType storedValue;

    public AnyType read() {
        return storedValue;
    }

    public void write(AnyType x) {
        this.storedValue = x;
    }
}
