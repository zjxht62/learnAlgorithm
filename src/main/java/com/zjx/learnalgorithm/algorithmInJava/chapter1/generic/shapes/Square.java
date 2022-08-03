package com.zjx.learnalgorithm.algorithmInJava.chapter1.generic.shapes;

public class Square extends Shape{
    private double l;

    public Square(double l) {
        this.l = l;
    }

    public Square() {
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    @Override
    public double area() {
        return l*l;
    }
}
