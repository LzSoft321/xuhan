package pers.xuhan.java.designpattern_设计模式.decoratorpattern;

/**
 * @Filename: AbstractBread.java
 * @Description: 装饰者抽象类
 * @Version: 1.0
 * @Author: han.xu
 * @Email: han.xu@paat.com
 * @date: 2019/5/21 17:26
 */
public abstract class AbstractBread implements IBread {

    private final IBread bread;
    
    public AbstractBread(IBread bread) {
        this.bread = bread;
    }
    @Override
    public void prepair() {
        this.bread.prepair();
    }
    @Override
    public void kneadFlour() {
        this.bread.kneadFlour();
    }
    @Override
    public void steamed() {
        this.bread.steamed();
    }

    @Override
    public void process() {
        prepair();
        kneadFlour();
        steamed();
    }

}