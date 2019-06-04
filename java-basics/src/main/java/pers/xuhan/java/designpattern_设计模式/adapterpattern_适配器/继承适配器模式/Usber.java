package pers.xuhan.java.designpattern_设计模式.adapterpattern_适配器.继承适配器模式;

/**
 * @Filename: Usber.java
 * @Description: USB接口实现类：Usber
 * @Version: 1.0
 * @Author: han.xu
 * @Email: han.xu@paat.com
 * @date: 2019/5/21 21:19
 */
public class Usber implements Usb {

    @Override
    public void isUsb() {
        System.out.println("USB口");
    }

}