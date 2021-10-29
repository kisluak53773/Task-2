package com.company.shape.converter;

import com.company.shape.exception.WrongDigitsException;

public interface Converter {
    int[] convert(String str) throws WrongDigitsException;
}
