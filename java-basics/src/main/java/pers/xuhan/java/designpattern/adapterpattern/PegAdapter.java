package pers.xuhan.java.designpattern.adapterpattern;

public class PegAdapter implements IRoundPeg,ISquarePeg{

    private RoundPegImpl  roundPegImpl;
    private SquarePegImpl  squarePegImpl;

    public  PegAdapter(RoundPegImpl  roundPegImpl){
        this.roundPegImpl = roundPegImpl;
    }

    public  PegAdapter(SquarePegImpl  squarePegImpl){
        this.squarePegImpl = squarePegImpl;
    }

    @Override
    public void insertIntoHole(String msg) {
        roundPegImpl.insertIntoHole(msg);
    }

    @Override
    public void insert(String str) {
        squarePegImpl.insert(str);
    }
}