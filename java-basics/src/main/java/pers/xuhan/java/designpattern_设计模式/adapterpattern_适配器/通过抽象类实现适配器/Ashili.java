package pers.xuhan.java.designpattern_设计模式.adapterpattern_适配器.通过抽象类实现适配器;

public class Ashili extends Adapter {
    public void a(){
        System.out.println("实现A方法被调用");
    }
    public void d(){
        System.out.println("实现d方法被调用");
    }
}