package pers.xuhan.java.designpattern_设计模式.builderpattern.常用的建造者模式;

/**
 * 具体的装机人员
 */
class ConcreteBuilder extends  Builder {

    Computer computer = new Computer();

    @Override
    public void buildCPU() {
        computer.Add("装CPU");
    }

    @Override
    public void buildMainBoard() {
        computer.Add("装主板");
    }

    @Override
    public void buildHD() {
        computer.Add("装硬盘");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}