package com.company.shape.validator.impl;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringValidatorImplementationTest {

    @Test
    public void testValidate() {
        StringValidatorImplementation valid=new StringValidatorImplementation();
        String str="18 9";
        boolean actual=valid.Validate(str);
        boolean expected=true;
        assertEquals(actual,expected);
    }
}