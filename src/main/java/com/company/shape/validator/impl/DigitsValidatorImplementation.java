package com.company.shape.validator.impl;

import com.company.shape.validator.DigitsValidator;

public class DigitsValidatorImplementation implements DigitsValidator {
    @Override
    public boolean validate(Integer a,Integer b) {
        boolean result=false;
        if(b.compareTo(a/2)==0){
            result=true;
        }
        return result;
    }
}
