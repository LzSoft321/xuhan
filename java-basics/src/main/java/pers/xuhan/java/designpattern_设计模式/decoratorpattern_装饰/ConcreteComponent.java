package pers.xuhan.java.designpattern_设计模式.decoratorpattern_装饰;

/**
 * 具体构建角色,实现抽象构建角色
 * @author Administrator
 *
 */
public class ConcreteComponent implements Component {
  @Override
  public void doSomething() {
    System.out.println("功能A");
  }
}