package pers.xuhan.java.designpattern.builderpattern.常用的建造者模式;

/**
 * 装机人员装机
 */
class Director {
    public void Construct(Builder builder) {
        builder.buildCPU();
        builder.buildMainBoard();
        builder.buildHD();
    }
}