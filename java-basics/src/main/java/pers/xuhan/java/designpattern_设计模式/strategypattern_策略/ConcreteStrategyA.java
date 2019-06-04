package pers.xuhan.java.designpattern_设计模式.strategypattern_策略;

/**
 * 具体算法A
 */
class ConcreteStrategyA extends Strategy {
    //算法A实现方法
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法A的实现");
    }
}