package pers.xuhan.java.designpattern.adapterpattern.组合适配器模式;

public class Clienter {

    public static void main(String[] args) {
        Ps2 p = new Adapter(new Usber());
        p.isPs2();
    }

}