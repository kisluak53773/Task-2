package com.company.shape.converter.impl;

import com.company.shape.converter.Converter;
import com.company.shape.exception.WrongDigitsException;
import com.company.shape.parser.impl.StringParserImplementation;
import com.company.shape.validator.impl.DigitsValidatorImplementation;

import java.util.ArrayList;

public class ConverterImplementation implements Converter {
    @Override
    public int[] convert(String str) throws WrongDigitsException {
        DigitsValidatorImplementation valid=new DigitsValidatorImplementation();
        StringParserImplementation prs=new StringParserImplementation();
        String []buffer=prs.parse(str);
        ArrayList<Integer>ints=new ArrayList<>();
        for (String a:buffer){
            ints.add(Integer.parseInt(a));
        }
        if(!valid.validate(ints.get(0),ints.get(1))){
            throw new WrongDigitsException();
        }
        int result[]=new int[ints.size()];
        for(int i=0;i<ints.size();i++){
            result[i]=ints.get(i);
        }
        return result;
    }
}
