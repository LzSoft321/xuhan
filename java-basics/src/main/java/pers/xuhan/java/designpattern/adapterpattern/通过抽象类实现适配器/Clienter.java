package pers.xuhan.java.designpattern.adapterpattern.通过抽象类实现适配器;

public class Clienter {

    public static void main(String[] args) {
        A a = new Ashili();
        a.a();
        a.d();
    }

}