package pers.xuhan.java.designpattern_设计模式.decoratorpattern_装饰;

/**
 * 具体装饰角色2，需要继承装饰角色，并且给出要附加的功能
 * @author Administrator
 *
 */
public class ConcreteDecorator2 extends Decorator {
  public ConcreteDecorator2(Component component) {
    super(component);
  }
  @Override
  public void doSomething() {
    super.doSomething();
    this.doAnothing();//在传过来的具体构件角色原有功能的基础上附加的功能
  }
  //附加的功能
  public void doAnothing() {
    System.out.println("功能c");
  }
}


