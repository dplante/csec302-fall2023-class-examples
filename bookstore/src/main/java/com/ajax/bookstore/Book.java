package com.ajax.bookstore;

/**
 * Hello world!
 *
 */
public class Book 
{
    public final static int PAGE_UNDEFINED = -1;
    private boolean myIsOpen;
    private int myMaxNumPages;
    private int myPageNum;

    public Book(String title, String author, int numPages) {
        myIsOpen = false;
        myMaxNumPages = numPages;
        myPageNum = PAGE_UNDEFINED;
    }

    public boolean flipPage(boolean forward) {
        return true;
    }

    public boolean open() {
        return true;
    }

    public boolean close() {
        return true;
    }

    public boolean turnToPage(int num) {
        return true;
    }

    public boolean checkIfOpen() {
        return myIsOpen;
    }

    public void setPage(int num) {
        
    }
}
