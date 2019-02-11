package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {
    @Test
    public void testGetDescription() {
        Book book = new Book("something","Mircea","2012");
        assertEquals("This book's name is something written by Mircea",book.getDescription());
    }
}
