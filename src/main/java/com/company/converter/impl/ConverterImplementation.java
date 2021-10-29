package com.company.converter.impl;

import com.company.converter.Converter;
import com.company.exception.WrongDigitsException;
import com.company.parser.impl.StringParserImplementation;
import com.company.validator.impl.DigitsValidatorImplementation;

import java.util.ArrayList;

public class ConverterImplementation implements Converter {
    @Override
    public int[] Convert(String str) throws WrongDigitsException {
        DigitsValidatorImplementation valid=new DigitsValidatorImplementation();
        StringParserImplementation prs=new StringParserImplementation();
        String []buffer=prs.Parse(str);
        ArrayList<Integer>ints=new ArrayList<>();
        for (String a:buffer){
            ints.add(Integer.parseInt(a));
        }
        if(!valid.Validate(ints.get(0),ints.get(1))){
            throw new WrongDigitsException();
        }
        int result[]=new int[ints.size()];
        for(int i=0;i<ints.size();i++){
            result[i]=ints.get(i);
        }
        return result;
    }
}
