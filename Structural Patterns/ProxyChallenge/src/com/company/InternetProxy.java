package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class InternetProxy implements Internet{
    private InternetImpl internet;
    private ArrayList<String> restricted;

    public InternetProxy() {
        restricted = new ArrayList<>(Arrays.asList("www.facebook.com","www.reddit.com","www.instagram.com"));
    }

    @Override
    public void connect(String link) {
        if (!restricted.contains(link.toLowerCase())){
            if(internet == null){
                internet = new InternetImpl();
            }
            internet.connect(link.toLowerCase());
            return;
        }
        System.out.println(link + " is a restricted site access denied.");
    }
}
