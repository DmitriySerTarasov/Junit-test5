package org.example;

import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookShelfTest {
    int[] array = new int[]{14, 16, 19, 32, 34, 36, 56, 69, 72};
    @Test
    public void emptyArrayTest() throws Exception {

        int [] emptyArray = new int[0];
        int newBook = 32;
        int expect = 0;

        int result = Main.numberLargeSizedBooks(emptyArray,newBook);

        Assertions.assertEquals(expect, result);
    }

    @Test
    public void negativeNumberTest(){
        int newBook = -5;

        Assertions.assertThrows(Exception.class,() -> {
            Main.numberLargeSizedBooks(array,newBook);
        });
    }

    @Test
    public void regularTest() throws Exception {

        int newBook = 32;
        int expect = 5;

        int result = Main.numberLargeSizedBooks(array,newBook);

        Assertions.assertEquals(expect, result);
    }
    @Test
    public void minimumTest() throws Exception {

        int newBook = 5;
        int expect = 9;

        int result = Main.numberLargeSizedBooks(array,newBook);

        Assertions.assertEquals(expect, result);
    }

    @Test
    public void maximumTest() throws Exception {

        int newBook = 80;
        int expect = 0;

        int result = Main.numberLargeSizedBooks(array,newBook);

        Assertions.assertEquals(expect, result);
    }
}