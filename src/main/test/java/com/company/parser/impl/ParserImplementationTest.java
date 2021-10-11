package com.company.parser.impl;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ParserImplementationTest {

    @Test
    public void testParse() {
        ParserImplementation parse=new ParserImplementation();
        String []actual=parse.Parse("18 9");
        String []expected={"18","9"};
        assertEquals(actual,expected);
    }
}