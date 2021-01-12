package com.company;

public class ClassAdapter extends IntergerValue{
    @Override
    public int getInteger() {
        return 2 + super.getInteger();
    }
}
