package org.shan.lab2.mode6;

import org.shan.lab2.mode6.resume.Resume;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Resume resume = new Resume("zly", 25, "Photo........");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if ("y".equalsIgnoreCase(str)) {
            resume = (Resume) resume.createDeepClone();
            System.out.println("deepclone");
        } else if ("n".equalsIgnoreCase(str)) {
            resume = (Resume) resume.createClone();
            System.out.println("clone");
        }

    }
}
