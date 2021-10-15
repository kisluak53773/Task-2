package com.company.filler;

import com.company.converter.impl.ConverterImplementation;
import com.company.customexception.WrongDigitsException;
import com.company.factory.CubeFactory;
import com.company.factory.CubePartsFactory;
import com.company.factory.impl.CubeCenterPartsFactory;
import com.company.factory.impl.CubeFactoryImplementation;
import com.company.factory.impl.CubeRibPartsFactory;
import com.company.figure.Cube;
import com.company.figure.CubeParts;
import com.company.filereader.ReadFromFile;
import com.company.repository.Repository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.URI;
import java.util.List;

public class RepositoryFiller {
    private final static Logger logger= LogManager.getLogger();

    public void Fill(URI path){
        ConverterImplementation converter=new ConverterImplementation();
        ReadFromFile reader=new ReadFromFile();
        CubeFactory cubeFactory=new CubeFactoryImplementation();
        CubePartsFactory centerFactory=new CubeCenterPartsFactory();
        CubePartsFactory ribFactory=new CubeRibPartsFactory();
        try {
            List<String> buffer=reader.Read(path);
            for(int i=0;i<buffer.size();i++) {
                int[] nums = converter.Convert(buffer.get(i));
                CubeParts rib = ribFactory.CreateCubePart(nums[0]);
                CubeParts center = centerFactory.CreateCubePart(nums[1]);
                Cube cube = cubeFactory.CreateCube(center,rib,nums[i],i );
                Repository.add(cube);
            }
        } catch (WrongDigitsException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
    }
}
