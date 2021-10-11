package com.company.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.URISyntaxException;

public class Main {
    private final static Logger logger= LogManager.getLogger();
    public static void main(String[] args) throws URISyntaxException {
        logger.info("test");
    }
}
