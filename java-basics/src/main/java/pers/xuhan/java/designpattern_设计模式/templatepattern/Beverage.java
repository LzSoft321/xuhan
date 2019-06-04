package pers.xuhan.java.designpattern_设计模式.templatepattern;

// 抽象基类，为所有的子类提供一个模版
public abstract class Beverage {
    
    // 具体的模板方法， 要用final关键字进行修饰，避免子类进行修改
    public final void prepareBeverageTemplate() {
        // 1, 烧开水
        boilWater();
        
        // 2, 放到杯中
        putIntoCup();
        
        // 加入开水
        addHotWater();
        
        // 加入调味应有剂
        if(isCustomered())
        {
            addCondiments();
        }

    }

    private void boilWater() {
        System.out.println("烧开水");
    }

    protected abstract void putIntoCup();
    
    private void addHotWater() {
        System.out.println("加水");
    }
    protected abstract void addCondiments();

    protected boolean isCustomered() {
        return true;
    }

}