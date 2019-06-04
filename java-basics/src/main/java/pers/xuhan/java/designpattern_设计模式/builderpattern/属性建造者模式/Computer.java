package pers.xuhan.java.designpattern_设计模式.builderpattern.属性建造者模式;


/**
 * @Filename: Computer.java
 * @Description: 电脑对象
 * @Version: 1.0
 * @Author: han.xu
 * @Email: han.xu@paat.com
 * @date: 2019/5/20 20:13
 */
public class Computer { 
    private String cpu; 
    private String screen; 
    private String memory; 
    private String mainboard; 
    public Computer(String cpu, String screen, String memory, String mainboard) { 
        this.cpu = cpu; 
        this.screen = screen; 
        this.memory = memory; 
        this.mainboard = mainboard; 
    }
}