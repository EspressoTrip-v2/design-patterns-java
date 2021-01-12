package com.juan;

public class CalculatorAdapter implements CalculatorInterface{
    Calculator calculator;
    Triangle t;

    public CalculatorAdapter(Triangle t) {
        this.t = t;
    }

    @Override
    public double getArea(Rectangle rectangle) {
        calculator = new Calculator();
        Rectangle r = new Rectangle();

        r.width = t.base;
        r.height = 0.5 * t.height;
        return calculator.getArea(r);

    }
}
