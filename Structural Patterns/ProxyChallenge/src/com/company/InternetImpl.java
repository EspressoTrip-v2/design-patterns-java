package com.company;

public class InternetImpl implements Internet{
    @Override
    public void connect(String link) {
        System.out.println("Connecting to " + link);
    }
}
