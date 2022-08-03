package com.zjx.learnalgorithm.algorithmInJava.chapter1.generic;

/**
 * 1.4.4
 *  数组类型的兼容性
 *  假设Employee IS-A Person，那么是不是意味着数组Employee[] IS-A Person[]呢？
 *  换句话说，如果一个例程接受Person[]作为参数，那么我们能不能把Employee[]作为参数传递呢？
 *
 *  看似Employee[]应该是和Person[]类型兼容的。
 *  假设还有Student IS-A Person，并设Employee[]是和Person[]类型兼容的。
 *
 *         Person[] arr = new Employee[5];  //编译：arrays are compatible
 *         arr[0] = new Student();  //编译：Student IS-A Person
 *
 *  两句都编译，而实际arr[0]里面是一个Employee，可是Student IS-NOT-A Employee，这就产生了类型混乱。
 *
 *  避免的方法是指定这些数组不是类型兼容的。但是Java中数组确实类型兼容的。
 *  这就叫做协变数组类型（covariant array type）。每个数组都知道它允许存储的对象的类型。
 *  如果将一个不兼容的类型插入到数组中，那么虚拟机会抛出一个ArrayStoreException异常。
 */

class Person {
    private String name;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Employee extends Person {

    private String job;

    public Employee() {
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + super.getName() + '\'' +
                "job='" + job + '\'' +
                '}';
    }
}

class Student extends Person {
    private int grade;

    public Student() {
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + super.getName() +
                "grade=" + grade +
                '}';
    }
}
public class CovariantArrayType {
    public static void main(String[] args) {
        Person[] arr = new Employee[5];
        arr[0] = new Student();

    }

}
