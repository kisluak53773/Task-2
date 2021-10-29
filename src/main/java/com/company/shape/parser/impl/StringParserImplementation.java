package com.company.shape.parser.impl;

import com.company.shape.parser.StringParser;

public class StringParserImplementation implements StringParser {
    @Override
    public String[] Parse(String str) {
        final String DELIMITER_REGEX="\\s+";
        str=str.trim();
        String[] result=str.split(DELIMITER_REGEX);
        return result;
    }
}
