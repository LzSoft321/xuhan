package pers.xuhan.java.designpattern_设计模式.builderpattern.常用的建造者模式;

abstract class Builder {
    /**
     * 第一步：装CPU
     */
   public abstract void buildCPU();

    /**
     * 第二步：装主板
     */
    public abstract void buildMainBoard();

    /**
     * 第三步：装硬盘
     */
    public abstract void buildHD();

    /**
     * 获得组装好的电脑
     * @return
     */
    public abstract Computer getComputer();
}