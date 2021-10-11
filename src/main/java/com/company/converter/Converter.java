package com.company.converter;

import com.company.customexception.WrongDigitsException;

import java.util.ArrayList;

public interface Converter {
    int[] Convert(String str) throws WrongDigitsException;
}
