package com.company.decorators;

import com.company.Shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape s) {
        super.setShape(s);
    }

    @Override
    public void draw() {
        System.out.println("\n*** Red Decorator ***");
        super.draw();
        System.out.print(" decorated Red.\n\n");
    }
}
