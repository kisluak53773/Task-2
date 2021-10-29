package com.company.shape.filler;

import com.company.shape.action.impl.MathWithFigureImplementation;
import com.company.shape.converter.impl.ConverterImplementation;
import com.company.shape.exception.WrongDigitsException;
import com.company.shape.factory.CubeFactory;
import com.company.shape.factory.CubePartsFactory;
import com.company.shape.factory.WarehouseFactory;
import com.company.shape.factory.impl.CubeCenterPartsFactory;
import com.company.shape.factory.impl.CubeFactoryImplementation;
import com.company.shape.factory.impl.CubeRibPartsFactory;
import com.company.shape.figure.CubeParts;
import com.company.shape.figure.Cube;
import com.company.shape.filereader.ReadFromFile;
import com.company.shape.repository.RepositoryCube;
import com.company.shape.repository.RepositoryWarehouse;
import com.company.shape.warehouse.Warehouse;
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
