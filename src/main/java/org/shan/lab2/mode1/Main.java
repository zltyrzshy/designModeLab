package org.shan.lab2.mode1;

public class Main {
    private static final String[] pages = {"Alice in Garden", "Tango", "cloudy", "Windy", "a box of chocolate"};

    public static void main(String[] args) {
        Book book = new Book(10);
        for (String page : pages) {
            if (!book.push(page)) {
                System.out.println("error");
            }
        }

        Iterator it = book.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
