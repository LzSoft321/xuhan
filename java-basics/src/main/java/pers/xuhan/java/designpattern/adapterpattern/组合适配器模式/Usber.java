package pers.xuhan.java.designpattern.adapterpattern.组合适配器模式;

public class Usber implements Usb {

    @Override
    public void isUsb() {
        System.out.println("USB口");
    }

}