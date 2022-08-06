package com.zjx.learnalgorithm.algorithmInJava.chapter1.generic;

/*
public class typeBounds {
    public static <AnyType> AnyType findMax(AnyType[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            //编译器无法证明在此处对compareTO的调用时合法的，所以程序不能运行
            //只有在AnyType是Comparable的情况下，才能保证compareTo方法存在。
            //因此我们需要使用类型限界来解决这个问题
            if (arr[i].compareTo(arr[maxIndex]) > 0) {
                maxIndex =i;
            }
        }
        return arr[maxIndex];
    }
}
*/

/*
public class typeBounds {
    //通过在尖括号中指定类型限界，可以保证参数必须具有的性质
    //而且因为Comparable接口如今是泛型的，所以应该写成：<AnyType extends Comparable<AnyType>>
    public static <AnyType extends Comparable<AnyType>> AnyType findMax(AnyType[] arr) {

    }
}
 */

/*
然而上面的代码还是不太行，
假设Shape实现Comparable<Shape>
设Square继承Shape
此时，我们只知道Square实现Comparable<Shape>
所以Square IS-A Comparable<Shape> 但Square IS-NOT-A Comparable<Square>

应该说AnyType IS-A Comparable<T>，其中T是AnyType的父类。由于我们不需要知道准确的类型T，因此我们可以使用通配符。
 */
public class typeBounds {
    public static <AnyType extends Comparable<? super AnyType>> AnyType findMax(AnyType[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[maxIndex]) > 0) {
                maxIndex = i;
            }

        }
        return arr[maxIndex];
    }

}