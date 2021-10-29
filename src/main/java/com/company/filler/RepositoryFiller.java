package com.company.filler;

import com.company.action.impl.MathWithFigureImplementation;
import com.company.converter.impl.ConverterImplementation;
import com.company.exception.WrongDigitsException;
import com.company.factory.CubeFactory;
import com.company.factory.CubePartsFactory;
import com.company.factory.WarehouseFactory;
import com.company.factory.impl.CubeCenterPartsFactory;
import com.company.factory.impl.CubeFactoryImplementation;
import com.company.factory.impl.CubeRibPartsFactory;
import com.company.figure.CubeParts;
import com.company.figure.Cube;
import com.company.filereader.ReadFromFile;
import com.company.repository.RepositoryCube;
import com.company.repository.RepositoryWarehouse;
import com.company.warehouse.Warehouse;
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
        WarehouseFactory warehouseFactory=new WarehouseFactory();
        MathWithFigureImplementation math=new MathWithFigureImplementation();
        try {
            List<String> buffer=reader.Read(path);
            for(int i=0;i<buffer.size();i++) {
                int[] nums = converter.Convert(buffer.get(i));
                CubeParts rib = ribFactory.CreateCubePart(nums[0]);
                CubeParts center = centerFactory.CreateCubePart(nums[1]);
                Cube cube = cubeFactory.CreateCube(center,rib,nums[2],nums[2]);
                RepositoryCube.add(cube);
                Warehouse warehouse=warehouseFactory.createWarehouse(nums[2], math.Volume(nums[0]),
                        math.Square(nums[0]),math.Perimeter(nums[0]));
                RepositoryWarehouse.add(warehouse);
            }
        } catch (WrongDigitsException e) {
            logger.error("Wrong digits");
        }
    }
}
