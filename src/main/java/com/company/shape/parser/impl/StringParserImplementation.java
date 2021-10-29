package com.company.shape.parser.impl;

import com.company.shape.parser.StringParser;

public class StringParserImplementation implements StringParser {
    static final String DELIMITER_REGEX="\\s+";
    @Override
    public String[] parse(String str) {
        str=str.trim();
        String[] result=str.split(DELIMITER_REGEX);
        return result;
    }
}
