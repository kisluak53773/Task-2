package com.company.shape.converter.impl;

import com.company.shape.exception.WrongDigitsException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ConverterImplementationTest {

    @Test
    public void testConvert() throws WrongDigitsException {
        ConverterImplementation conv=new ConverterImplementation();
        int []actual=conv.convert("18 9");
        int []expected={18,9};
        assertEquals(actual,expected);
    }
}