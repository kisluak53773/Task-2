package com.company.validator.impl;

import com.company.validator.DigitsValidator;

public class DigitsValidatorImplementation implements DigitsValidator {
    @Override
    public boolean Validate(Integer a,Integer b) {
        boolean result=false;
        if(b.compareTo(a/2)==0){
            result=true;
        }
        return result;
    }
}
