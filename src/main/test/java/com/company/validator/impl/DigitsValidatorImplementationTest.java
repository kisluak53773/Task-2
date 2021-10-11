package com.company.validator.impl;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DigitsValidatorImplementationTest {

    @Test
    public void testValidate() {
        DigitsValidatorImplementation valid=new DigitsValidatorImplementation();
        boolean actual=valid.Validate(10,7);
        boolean expected=false;
        assertEquals(actual,expected);
    }
}