package com.company.shape.validator.impl;

import com.company.shape.parser.impl.StringParserImplementation;
import com.company.shape.validator.StringValidator;

public class StringValidatorImplementation implements StringValidator {
    @Override
    public boolean validate(String str) {
        final String CHECK_REGX="\\d+[a-z]+";
        StringParserImplementation prs=new StringParserImplementation();
        boolean result=true;
        String buffer []= prs.parse(str);
        for(String a:buffer){
            if(a.matches(CHECK_REGX) || buffer.length!=3){
                result=false;
            }
        }
        return result;
    }
}
