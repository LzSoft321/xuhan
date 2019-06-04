package pers.xuhan.java.designpattern_设计模式.adapterpattern_适配器.继承适配器模式;

/**
 * @Filename: Adapter.java
 * @Description: 适配器：Adapter
 * @Version: 1.0
 * @Author: han.xu
 * @Email: han.xu@paat.com
 * @date: 2019/5/21 21:20
 */
public class Adapter extends Usber implements Ps2 {

    @Override
    public void isPs2() {
        isUsb();
    }

}