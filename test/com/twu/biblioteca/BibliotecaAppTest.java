package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BibliotecaAppTest {

    @Test
    public void testBibliotecaApp() {
        Printer printer = mock(Printer.class);
        Reader reader = mock(Reader.class);

        when(reader.read()).thenReturn("1");
        when(reader.read()).thenReturn("4");

        BibliotecaApp bibliotecaApp = new BibliotecaApp(printer,reader);
        bibliotecaApp.launchApp();

        verify(printer).print("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
//        verify(printer).print("The list of Books we have ");
        verify(printer).print("john story | john | 2000");


    }
    @Test
    public void testCheckOut(){
        Printer printer = mock(Printer.class);
        Reader reader = mock(Reader.class);

        when(reader.read()).thenReturn("2");
        when(reader.read()).thenReturn("john story");
        when(reader.read()).thenReturn("1");
        when(reader.read()).thenReturn("4");


        BibliotecaApp bibliotecaApp = new BibliotecaApp(printer,reader);
        bibliotecaApp.launchApp();

        verify(printer, never()).print("john story | john | 2000");

    }
    @Test
    public void testSearchBook(){

    }

}
