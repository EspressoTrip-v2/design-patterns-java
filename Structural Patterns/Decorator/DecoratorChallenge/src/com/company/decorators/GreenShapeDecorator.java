package com.company.decorators;

import com.company.Shape;

public class GreenShapeDecorator extends ShapeDecorator {
    public GreenShapeDecorator(Shape s) {
        super.setShape(s);
    }

    @Override
    public void draw() {
        System.out.println("\n*** Green Decorator ***");
        super.draw();
        System.out.print(" decorated Green.\n\n");
    }
}
