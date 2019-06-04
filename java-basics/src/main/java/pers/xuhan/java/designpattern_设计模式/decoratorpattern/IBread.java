package pers.xuhan.java.designpattern_设计模式.decoratorpattern;

/**
 * @Filename: IBread.java
 * @Description: 装饰者与被装饰者共同要实现的接口
 * @Version: 1.0
 * @Author: han.xu
 * @Email: han.xu@paat.com
 * @date: 2019/5/21 16:52
 */
public interface IBread {

    public void prepair();
    
    public void kneadFlour();
    
    public void steamed();
    
    public void process();
}