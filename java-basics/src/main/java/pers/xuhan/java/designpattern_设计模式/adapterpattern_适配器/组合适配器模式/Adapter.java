package pers.xuhan.java.designpattern_设计模式.adapterpattern_适配器.组合适配器模式;

public class Adapter implements Ps2 {
    
    private Usb usb;
    public Adapter(Usb usb){
        this.usb = usb;
    }
    @Override
    public void isPs2() {
        usb.isUsb();
    }

}