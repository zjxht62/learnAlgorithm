package com.zjx.learnalgorithm.algorithmInJava.chapter1.generic;

import com.zjx.learnalgorithm.algorithmInJava.chapter1.generic.shapes.Shape;
import com.zjx.learnalgorithm.algorithmInJava.chapter1.generic.shapes.Square;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 1.5.4 带有限制的通配符
 */
public class WildcardDemo {
    // 传入Shape数组计算总面积
    // 具有协变性，传入Square[]也能编译,程序也能正常运行
    public static double totalArea(Shape[] arr) {
        double total = 0;
        for (Shape s : arr) {
            if (s != null) {
                total += s.area();
            }
        }
        return total;
    }

    //泛型集合不是协变的。所以我们不能将Collection<Square>作为参数传递
    public static double totalArea(Collection<Shape> arr) {
        double total = 0;
        for (Shape s : arr) {
            if (s != null) {
                total += s.area();
            }
        }
        return total;
    }

    //泛型集合不是协变的。但是我们可以使用通配符来弥补。
    //通配符用来表示参数类型的子类（或超类）
    public static double totalAreaWithWildcard(Collection<? extends Shape> arr) {
        double total = 0;
        for (Shape s : arr) {
            if (s != null) {
                total += s.area();
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Square s1 = new Square(5);
        Square s2 = new Square(1);
        Square s3 = new Square(2);
        Square s4 = new Square(3);
        Square[] squares = {s1, s2, s3, s4};
        //数组具有斜边性，下面的代码可正确执行
        double total = totalArea(squares);
        System.out.println(total);

        Collection<Square> squareCollection = new ArrayList<>();
        squareCollection.add(s1);
        squareCollection.add(s2);
        squareCollection.add(s3);
        squareCollection.add(s4);
        //因为泛型集合不具备协变性，所以下面这句无法编译
//        total = totalArea(squareCollection);

        //使用通配符后，任何Shape的子类型的泛型集合都可以传入
        //所以传入Collection<Square> 也可以运行
        total = totalAreaWithWildcard(squareCollection);




    }
}
