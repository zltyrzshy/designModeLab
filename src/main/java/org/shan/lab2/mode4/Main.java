package org.shan.lab2.mode4;

import org.shan.lab2.mode4.connection.ConnectionFactory;
import org.shan.lab2.mode4.framework.Factory;

public class Main {
    public static final String[] protocols = {"IMAP", "HTTP", "POP3"};

    public static void main(String[] args) {
        Factory factory = new ConnectionFactory();
        for (String protocol : protocols) {
            factory.create(protocol).use();
        }
    }
}
