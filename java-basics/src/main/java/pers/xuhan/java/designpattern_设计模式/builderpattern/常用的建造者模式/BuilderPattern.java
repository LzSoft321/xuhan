package pers.xuhan.java.designpattern_设计模式.builderpattern.常用的建造者模式;

public class BuilderPattern {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.Construct(builder);
        Computer computer = builder.getComputer();
        computer.print();
    }
}