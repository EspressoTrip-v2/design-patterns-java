package com.juan;

public class Captain {

    public Captain() {
    }

    private static class CaptainHelper{
        private static final Captain captain = new Captain();
    }

    public static Captain getCaptain(){
        return CaptainHelper.captain;
    }

}
