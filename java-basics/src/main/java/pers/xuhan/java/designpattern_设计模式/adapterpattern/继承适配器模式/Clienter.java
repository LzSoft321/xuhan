package pers.xuhan.java.designpattern_设计模式.adapterpattern.继承适配器模式;

public class Clienter {

    public static void main(String[] args) {
        Ps2 p = new Adapter();
        p.isPs2();
    }

}