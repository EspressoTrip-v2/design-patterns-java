package com.company;

public class ObjectAdapter implements IntergerValueInterface {
    private IntergerValueInterface myInt;

    public ObjectAdapter(IntergerValueInterface myInt) {
        this.myInt = myInt;
    }

    @Override
    public int getInteger() {
        return 2 + this.myInt.getInteger();
    }
}
