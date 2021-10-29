package com.company.shape.parser.impl;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringParserImplementationTest {

    @Test
    public void testParse() {
        StringParserImplementation parse=new StringParserImplementation();
        String []actual=parse.Parse("18 9");
        String []expected={"18","9"};
        assertEquals(actual,expected);
    }
}