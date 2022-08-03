package com.zjx.learnalgorithm.algorithmInJava.chapter1.generic;

/**
 * 1.4.1
 * 使用Java中的继承实现泛型程序
 */
public class MemoryCell {

    private Object storedValue;

    public Object read() {
        return storedValue;
    }

    public void write(Object x) {
        this.storedValue = x;
    }

    public static void main(String[] args) {
        MemoryCell m = new MemoryCell();
        m.write("37");
        //使用Object类实现泛型方法需要进行强制类型转换
        //再有就是不能使用基本类型，如：int、long等
        String val = (String) m.read();
        System.out.println("Contents are:" + val);


    }
}
