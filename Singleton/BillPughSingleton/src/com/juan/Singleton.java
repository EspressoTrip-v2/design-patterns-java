package com.juan;

public class Singleton {

    private int data;

    private Singleton() {
        data =0;
    }

    private static class SingletonHelper{
        // Reference after getInstance is called
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHelper.instance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
