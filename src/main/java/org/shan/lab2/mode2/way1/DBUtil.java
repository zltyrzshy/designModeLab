package org.shan.lab2.mode2.way1;

public class DBUtil {
    private static final String[] strings = {"Alice in Garden", "Tango", "cloudy", "Windy", "a box of chocolate"};

    public static void main(String[] args) {
        Encrypt encrypt = new EncryptAdapter();
        for (String s : strings) {
            System.out.println(encrypt.encryptStrong(s));
            System.out.println(encrypt.encryptWeak(s));

        }
    }
}
