package pers.xuhan.java.designpattern.templatepattern;

public class Tea extends Beverage {

    @Override
    protected void putIntoCup() {
        System.out.println("把咖啡放到水杯中");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }

    @Override
    protected boolean isCustomered() {
        return false;
    }
}