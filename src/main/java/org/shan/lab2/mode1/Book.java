package org.shan.lab2.mode1;

class Book implements Aggregate {
    private String[] pages;
    private int length = 0;

    Book(int maxSize) {
        pages = new String[maxSize];
    }

    boolean push(String page) {
        if (length == pages.length) {
            return false;
        }
        pages[length] = page;
        length++;
        return true;
    }

    int getLength() {
        return this.length;
    }

    String getPageAt(int i) {
        return pages[i];
    }

    @Override
    public Iterator iterator() {
        return new BookIterator(this);
    }


}
