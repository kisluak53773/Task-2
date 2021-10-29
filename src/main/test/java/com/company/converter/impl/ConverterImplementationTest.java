package com.company.converter.impl;

import com.company.exception.WrongDigitsException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ConverterImplementationTest {

    @Test
    public void testConvert() throws WrongDigitsException {
        ConverterImplementation conv=new ConverterImplementation();
        int []actual=conv.Convert("18 9");
        int []expected={18,9};
        assertEquals(actual,expected);
    }
}