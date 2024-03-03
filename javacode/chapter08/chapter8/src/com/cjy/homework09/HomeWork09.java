package com.cjy.homework09;

public class HomeWork09 {
}

class Point{
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class LabeledPoint extends Point{
    String label;
    public LabeledPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }
}