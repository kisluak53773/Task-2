package com.company.filereader;

import com.company.validator.impl.StringValidatorImplementation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFromFile {
    private final static Logger logger= LogManager.getLogger();
    public static String[] Read(URI path){
        List<String> lines = new ArrayList<>();
        List<String> buffer=new ArrayList<>();
        StringValidatorImplementation valid=new StringValidatorImplementation();
        try (Stream<String> lineStream = Files.newBufferedReader(Path.of(path)).lines()) {
            lines = lineStream.collect(Collectors.toList());
        }catch (IOException e){
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        for(int i=0;i<lines.size();i++){
            if(valid.Validate(lines.get(i))){
               buffer.add(lines.get(i));
            }
        }
        String []result=new String[buffer.size()];
        for(int i=0;i<buffer.size();i++){
            result[i]=buffer.get(i);
        }
        return result;
    };
}
