package pers.xuhan.java.designpattern_设计模式.adapterpattern_适配器.组合适配器模式;

public class Usber implements Usb {

    @Override
    public void isUsb() {
        System.out.println("USB口");
    }

}