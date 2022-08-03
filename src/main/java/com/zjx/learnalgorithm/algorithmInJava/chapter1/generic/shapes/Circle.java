package com.zjx.learnalgorithm.algorithmInJava.chapter1.generic.shapes;

public class Circle extends Shape{
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return 3.14*r*r;
    }
}
