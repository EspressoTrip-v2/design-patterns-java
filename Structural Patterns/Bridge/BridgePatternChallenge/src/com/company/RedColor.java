package com.company;

public class RedColor extends IColor{
    @Override
    public String fillWithColor(int borderWidth) {
        return "Red color has a border of " + borderWidth + " inch border.";
    }
}
