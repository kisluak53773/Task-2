package com.company.repository;


import com.company.figure.Cube;


import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Repository {
    private final static Repository REPOSITORY=new Repository();
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

    public Cube get(int index){
        return cubes.get(index);
    }

    public void set(int index,Cube newCube){
         cubes.set(index,newCube);
    }

    public List<Cube> query(Specification specification){
        List<Cube> list=cubes.stream().filter(o->specification.specify(o)).collect(Collectors.toList());
        return list;
    }
}
