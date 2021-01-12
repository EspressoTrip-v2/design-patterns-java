package com.juan;

public class Singleton {
    private int data;
    // Volatile makes variable synchronized across Threads
    private volatile static Singleton instance;

    private Singleton() {
        data = 0;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            // Sync the class
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
