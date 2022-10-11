package org.shan.lab2.mode1;

class BookIterator implements Iterator {
    private Book book;
    private int index;

    BookIterator(Book book) {
        this.book = book;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < book.getLength();
    }

    @Override
    public Object next() {
        String page = book.getPageAt(index);
        index++;
        return page;
    }
}
