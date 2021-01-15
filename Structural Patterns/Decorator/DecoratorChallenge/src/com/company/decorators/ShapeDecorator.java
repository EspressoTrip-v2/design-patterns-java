package com.company.decorators;

import com.company.Shape;

public abstract class ShapeDecorator implements Shape {
    private Shape shape;

    protected void setShape(Shape s) {
        shape = s;
    }
    @Override
    public void draw() {
        if (shape != null) {
            shape.draw();
        }
    }
}
