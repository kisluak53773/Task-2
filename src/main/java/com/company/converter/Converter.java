package com.company.converter;

import com.company.exception.WrongDigitsException;

public interface Converter {
    int[] Convert(String str) throws WrongDigitsException;
}
