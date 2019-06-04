package pers.xuhan.java.designpattern_设计模式.strategypattern;

/**
 * 客户端代码：实现不同的策略
 */
public class StrategyPattern {
    public static void main(String[] args) {

        Context context;

        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}