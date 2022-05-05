package com.billcode.solid;

import java.util.List;

public class ShapesPrinter {
    public String json(int sum) {
        return "{Shapes_Sum: %s}".formatted(sum);
    }

    public String csc(int sum) {
        return "Shapes_Sum,%s".formatted(sum);
    }
}
