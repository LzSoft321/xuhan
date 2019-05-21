package pers.xuhan.java.designpattern.decoratorpattern;

/**
 * @Filename: IBread.java
 * @Description: 面包抽象类
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