package pers.xuhan.java.designpattern.adapterpattern;

public class SquarePegImpl implements ISquarePeg {
    public void insert(String str) {
        System.out.println("SquarePeg insert():" + str);
    }

}