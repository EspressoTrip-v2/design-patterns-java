package com.company;

public class GreenColor extends IColor{
    @Override
    public String fillWithColor(int borderWidth) {
        return "Green color has a border of " + borderWidth + " inch border.";
    }
}
