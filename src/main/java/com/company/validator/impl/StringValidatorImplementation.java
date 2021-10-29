package com.company.validator.impl;

import com.company.parser.impl.StringParserImplementation;
import com.company.validator.StringValidator;

public class StringValidatorImplementation implements StringValidator {
    @Override
    public boolean Validate(String str) {
        final String CHECK_REGX="\\d+[a-z]+";
        StringParserImplementation prs=new StringParserImplementation();
        boolean result=true;
        String buffer []= prs.Parse(str);
        for(String a:buffer){
            if(a.matches(CHECK_REGX) || buffer.length!=3){
                result=false;
            }
        }
        return result;
    }
}
