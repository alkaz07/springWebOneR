package com.example.springWebOne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import rectangle.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

public class TestLoader {
    //вариант когда все ок
    @Test
    public void testLoadOk0()  {
        String s = "rectangles_ok.txt";
        Assertions.assertDoesNotThrow(()->Loader.loadRecList(s));
    }

    @Test
    public void testLoadOk1() throws GeometryException, FileNotFoundException {
        String s = "rectangles_ok.txt";
        //создать коллекцию, которая должна получиться
        List<Rectangle> expected = new Vector<>();
        expected.add(new Rectangle(10, 15));
        expected.add(new Rectangle(15, 12));
        expected.add(new Rectangle(3.4, 7.12));
        Assertions.assertIterableEquals(expected, Loader.loadRecList(s));
    }
    @Test
    public void testLoadBad0() throws GeometryException, FileNotFoundException {
        String s = "test/resourses/abracadabra.net";
        Assertions.assertThrows(Exception.class, ()->Loader.loadRecList(s));

    }
    @Test
    public void testLoadBad1() throws GeometryException, FileNotFoundException {
        String s = "test/resourses/bad1.txt";
        Assertions.assertThrows(Exception.class, ()->Loader.loadRecList(s));

    }
    @Test
    public void testLoadBad2() throws GeometryException, FileNotFoundException {
        String s = "test/resourses/bad2.txt";
        Assertions.assertThrows(Exception.class, ()->Loader.loadRecList(s));

    }
    @Test
    public void testLoadBad3() throws GeometryException, FileNotFoundException {
        String s = "test/resourses/bad3.txt";
        Assertions.assertThrows(Exception.class, ()->Loader.loadRecList(s));

    }
    @Test
    public void testLoadBad4() throws GeometryException, FileNotFoundException {
        String s = "test/resourses/bad4.txt";
        Assertions.assertThrows(Exception.class, ()->Loader.loadRecList(s));

    }
    @Test
    public void testLoadBad5() throws GeometryException, FileNotFoundException {
        String s = "test/resourses/bad5.txt";
        Assertions.assertThrows(Exception.class, ()->Loader.loadRecList(s));

    }
    @Test
    public void testLoadBad6() throws GeometryException, FileNotFoundException {
        String s = "test/resourses/bad6.txt";
        Assertions.assertThrows(Exception.class, ()->Loader.loadRecList(s));

    }
    @Test
    public void testLoadBad7() {
        String s = "src/test/resourses/bad7.txt";
        Assertions.assertThrows(NegativeLengthException.class, ()->Loader.loadRecList(s));

    }
    @Test
    public void testLoadBad8() throws IOException {
        String s = "src/test/resourses/bad8.txt";
        FileWriter fileWriter = new FileWriter(s);
        fileWriter.write("10 0");
        fileWriter.close();
        Assertions.assertThrows(ZeroLengthException.class, ()->Loader.loadRecList(s));
        new File(s).delete();
    }

}
