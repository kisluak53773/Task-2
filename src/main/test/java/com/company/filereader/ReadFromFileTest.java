package com.company.filereader;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URISyntaxException;

import static org.testng.Assert.*;

public class ReadFromFileTest {

    @Test
    public void testRead() throws URISyntaxException {
        String []actual=ReadFromFile.Read(Thread.currentThread().getContextClassLoader().getResource("data/test.txt").toURI());
        String []expected={"18 9","30 15"};
        assertEquals(actual,expected);
    }
}