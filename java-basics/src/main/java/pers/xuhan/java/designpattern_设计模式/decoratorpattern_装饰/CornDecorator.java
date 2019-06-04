package pers.xuhan.java.designpattern_设计模式.decoratorpattern_装饰;

/**
 * @Filename: CornDecorator.java
 * @Description: 装饰者类
 * @Version: 1.0
 * @Author: han.xu
 * @Email: han.xu@paat.com
 * @date: 2019/5/21 17:01
 */
public class CornDecorator extends AbstractBread{

    public CornDecorator(IBread bread) {
        
        super(bread);
    }

    public void paint(){
        
        System.out.println("添加柠檬黄的着色剂");
    }
    @Override
    public void kneadFlour() {
        //添加着色剂后和面
        this.paint();
        super.kneadFlour();
    }

    
}