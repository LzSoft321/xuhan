package pers.xuhan.java.designpattern_设计模式.decoratorpattern;

public class Client {

    public static void main(String[] args) {
        
        System.out.println("=======开始装饰馒头");
        IBread normalBread = new NormalBread();
        normalBread = new SweetDecorator(normalBread);
        normalBread = new CornDecorator(normalBread);
        normalBread.process();
        System.out.println("=======装饰馒头结束");
    }
}