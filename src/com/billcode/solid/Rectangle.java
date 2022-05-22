package com.billcode.solid;

public class Rectangle implements Shape, ThreeDimensionalShape{
    @Override
    public double area() {
        return 20;
    }

    @Override
    public double volume() {
        return 0;
    }
}
