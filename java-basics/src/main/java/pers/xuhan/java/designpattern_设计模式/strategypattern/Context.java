package pers.xuhan.java.designpattern_设计模式.strategypattern;

/**
 * 上下文，维护一个对策略类对象的引用
 */
class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.AlgorithmInterface();
    }
}