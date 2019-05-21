package pers.xuhan.java.designpattern.decoratorpattern;

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