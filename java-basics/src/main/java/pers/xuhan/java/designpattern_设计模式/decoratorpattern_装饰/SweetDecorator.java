package pers.xuhan.java.designpattern_设计模式.decoratorpattern_装饰;

/**
 * @Filename: SweetDecorator.java
 * @Description: 装饰者类
 * @Version: 1.0
 * @Author: han.xu
 * @Email: han.xu@paat.com
 * @date: 2019/5/21 17:27
 */
public class SweetDecorator extends AbstractBread {

    public SweetDecorator(IBread bread) {
        
        super(bread);
    }

    public void paint(){
        
        System.out.println("添加甜蜜素...");
    }
    
    @Override
    public void kneadFlour() {
        //添加甜蜜素后和面
        this.paint();
        super.kneadFlour();
    }
    
}