package com.billcode.solid;

import java.util.List;

public class AreaCalculatorV2 implements IAreaCalculator {

    @Override
    public int sum(List<Shape> shapes) {
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++){
            sum += shapes.get(i).area();
        }
        return sum;
    }

    //added new class
//    public String json(List<Object> shapes;) {
//        return "{sum: %s}".formatted(sum(shapes));
//    }
//
//    public String csc(List<Object> shapes;) {
//        return "sum,%s".formatted(sum(shapes));
//    }
}
