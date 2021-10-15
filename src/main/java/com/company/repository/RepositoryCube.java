package com.company.repository;


import com.company.comparison.CompareCenter;
import com.company.comparison.CompareId;
import com.company.comparison.CompareRib;
import com.company.figure.Cube;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class RepositoryCube {
    private final static RepositoryCube REPOSITORY_CUBE =new RepositoryCube();
    private static List<Cube> cubes;

    public static boolean add(Cube cube){
        return cubes.add(cube);
    }

    public static boolean addAll(Collection<? extends Cube> cubeCollection){
        return cubes.addAll(cubeCollection);
    }

    public static boolean removeAll(Collection<?> cubeCollection){
        return cubes.removeAll(cubeCollection);
    }

    public static boolean Remove(Cube cube){
        return cubes.remove(cube);
    }

    public static Cube get(int index){
        return cubes.get(index);
    }

    public static void set(int index,Cube newCube){
         cubes.set(index,newCube);
    }

    public static int getIndex(int id){
        int index = 0;
        for(int i=0;i<cubes.size();i++){
            if(cubes.get(i).getId()==id){
                index=i;
            }
        }
        return index;
    }

    public static void sortById(){
        CompareId compareId=new CompareId();
        cubes.sort(compareId);
    }

    public static void sortByCenter(){
        CompareCenter compareCenter=new CompareCenter();
        cubes.sort(compareCenter);
    }

    public static void sortByRib(){
        CompareRib compareRib=new CompareRib();
        cubes.sort(compareRib);
    }

    public static List<Cube> query(Specification specification){
        List<Cube> list=cubes.stream().filter(o->specification.specify(o)).collect(Collectors.toList());
        return list;
    }
}
