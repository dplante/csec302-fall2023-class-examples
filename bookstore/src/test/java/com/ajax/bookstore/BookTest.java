package com.ajax.bookstore;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple Book class.
 */
public class BookTest 
{
    /**
     * Check that initial book is closed when created.
     */
    @Test
    public void checkInitialBookClosed() {
        Book book = new Book("MyTitle", "MyAuthor", 100);
        assertFalse("Initial book should be closed", book.checkIfOpen());
    }

    /**
     * Check that flipping page from any non-border page increases by one
     * if going forward
     */
    @Test
    public void flipForwardMiddle()
    {
        Book book = new Book("MyTitle", "MyAuthor", 100);
        /*
         * - make sure to open book
         * - set the page to somewhere in the middle (between 1 and 100)
         * - let's set it to 50
         * - try to flip page, should get to 51
         */
        book.open();
        book.setPage(50);
        assertTrue("At page 50, should go to 51", book.flipPage(true));
    }

    /**
     * Check that flipping page from last page fails
     */
    @Test
    public void flipForwardFromLastPage()
    {
        Book book = new Book("MyTitle", "MyAuthor", 100);
        /*
         * - make sure to open book
         * - set the page to somewhere in the middle (between 1 and 100)
         * - let's set it to 50
         * - try to flip page, should get to 51
         */
        book.open();
        book.setPage(100);
        assertFalse("At page 100, cannot flip forward", book.flipPage(true));
    }

    
}
