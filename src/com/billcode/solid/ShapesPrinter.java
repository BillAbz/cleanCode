package com.billcode.solid;

import java.util.List;

public class ShapesPrinter {

    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes) {
        return "{Shapes_Sum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csc(List<Shape> shapes) {
        return "Shapes_Sum,%s".formatted(areaCalculator.sum(shapes));
    }
}
