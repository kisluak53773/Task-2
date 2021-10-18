package com.company.filereader;

import org.testng.annotations.Test;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class ReadFromFileTest {

    @Test
    public void testRead() throws URISyntaxException {
        ReadFromFile reader=new ReadFromFile();
        List<String> actual=reader.Read(Thread.currentThread().getContextClassLoader().getResource("data/test.txt").toURI());
        List<String> expected=new ArrayList<>();
        expected.add("18 9 1");
        expected.add("30 15 2");
        assertEquals(actual,expected);
    }
}