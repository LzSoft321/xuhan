package pers.xuhan.java.designpattern.adapterpattern;

public class RoundPegImpl implements IRoundPeg {
    @Override
    public void insertIntoHole(String msg) {
        System.out.println("RoundPeg insertIntoHole():"+msg);
    }
}