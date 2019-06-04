package pers.xuhan.java.designpattern_设计模式.builderpattern_建造者.属性建造者模式;

public class Click {
    public static void main(String[] args) {
        // 非 Builder 模式 
        Computer computer = new Computer("cpu", "screen", "memory", "mainboard"); 
        // Builder 模式 
        NewComputer newComputer = new NewComputer.Builder() 
        .cpu("cpu") 
        .screen("screen") 
        .memory("memory") 
        .mainboard("mainboard") 
        .build();
    } 
} 