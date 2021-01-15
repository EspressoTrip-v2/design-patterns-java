package com.company;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Client {

    public static void main(String[] args) {
        int c;
        try (InputStream in = new LowerCaseinputStream(new BufferedInputStream(new FileInputStream("text.txt")))) {
            while ((c = in.read())>=0) {
                System.out.println((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
