package pers.xuhan.java.designpattern.decoratorpattern;

/**
 * @Filename: NormalBread.java
 * @Description: 被装饰者类
 * @Version: 1.0
 * @Author: han.xu
 * @Email: han.xu@paat.com
 * @date: 2019/5/21 17:25
 */
public class NormalBread implements IBread{

    @Override
    public void prepair() {
        
        System.out.println("准备面粉,水以及发酵粉...");
    }

    @Override
    public void kneadFlour() {
        
        System.out.println("和面...");
    }

    @Override
    public void steamed() {

        System.out.println("蒸馒头...香喷喷的馒头出炉了");
    }

    @Override
    public void process() {

        prepair();
        kneadFlour();
        steamed();
    }

}