package com.company.parser.impl;

import com.company.parser.Parser;

public class ParserImplementation implements Parser {
    @Override
    public String[] Parse(String str) {
        final String DELIMITER_REGEX="\\s+";
        str=str.trim();
        String[] result=str.split(DELIMITER_REGEX);
        return result;
    }
}
