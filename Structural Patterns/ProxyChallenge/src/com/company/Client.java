package com.company;

public class Client {

    public static void main(String[] args) {
        Internet internet = new InternetProxy();

        // Connect to sites
        internet.connect("www.facebook.com");
        internet.connect("www.instagram.com");
        internet.connect("www.reddit.com");
        internet.connect("www.cooking.com");
        internet.connect("www.funnycats.com");
    }
}
