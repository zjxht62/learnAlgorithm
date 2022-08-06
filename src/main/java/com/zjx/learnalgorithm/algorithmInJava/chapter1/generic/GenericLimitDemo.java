package com.zjx.learnalgorithm.algorithmInJava.chapter1.generic;


/**
 * 1.5.8 对于泛型的限制
 */
public class GenericLimitDemo {
    public static void main(String[] args) {

        //基本类型
        //基本类型不能用作类型参数。
        //所以GenericMemoryCell<int>是非法的，必须使用包装类



        //instanceof检测
        //instanceod检测黑类型转换只对原始类型进行。
        GenericMemoryCell<Integer> cell1 = new GenericMemoryCell<>();
        cell1.write(4);
        Object cell = cell1;
        //此处的类型转换是成功的，因为所有的类型都是GenericMemoryCell
        GenericMemoryCell<String> cell2 = (GenericMemoryCell<String>) cell;
        String s = cell2.read();//由于对read的调用企图返回一个String对象而产生运行时错误。


        //static的语境
        //在一个泛型类中，static方法和static域均不可引用类的类型变量，因为在类型擦除后，类型变量就不存在了。
        // 另外，由于实际上只存在一个原始的类，因此static域在该类的诸多泛型实例之间是共享的。


        //泛型类型的实例化
        //不能创建一个泛型类型的实例。如果T是一个类型变量，则语句
        //T obj = new T(); //右边是非法的
        //是非法的。T由它的限界代替，这可能是Object（或甚至是抽象类），因此对new的调用没有意义。


        //泛型数组对象
        //也不能创建一个泛型的数组。如果T是一个类型变量，则语句
        //T[] arr = new T[10];
        //是非法的。T将由它的限界代替，这很可能是Object T，于是（由类型擦除产生的）对T[]的类型转换将无法进行，
        //因为Object[] IS-NOT-A T[]。由于我们不能创建泛型对象的数组，因此一般说来我们必须创建一个擦除类型的数组，然后使用类型转换。
        // 这种类型转换将产生一个关于未检验的类型转换的编译警告。


        //参数化类型的数组
        //参数化类型的数组的实例化是非法的。考虑下列代码
        GenericMemoryCell<String>[] arr1 = new GenericMemoryCell[10];
        GenericMemoryCell<Double> celll = new GenericMemoryCell<>();
        celll.write(4.5);
        Object[] arr2 = arr1;
        //此处不会报错，因为数组的类型为GenericMemoryCell[]，而添加到数组中的对象也是GenericMemoryCell，
        // 因此不存在ArrayStoreException异常。
        arr2[0] = celll;
        //于是，该段代码没有类型转换，它最终将在下一行产生一个ClassCastException异常，这正是泛型应该避免的情况。
        String str = arr1[0].read();


    }
}
