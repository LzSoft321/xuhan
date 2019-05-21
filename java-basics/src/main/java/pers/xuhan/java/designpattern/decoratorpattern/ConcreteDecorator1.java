package pers.xuhan.java.designpattern.decoratorpattern;

/**
 * 具体装饰角色1，需要继承装饰角色，并且给出要附加的功能
 * @author Administrator
 *
 */
public class ConcreteDecorator1 extends Decorator {
  public ConcreteDecorator1(Component component) {
    super(component);
  }
  @Override
  public void doSomething() {
    super.doSomething();
    this.doAnothing();//在传过来的具体构件角色原有功能的基础上附加的功能
  }
  //附加的功能
  public void doAnothing() {
    System.out.println("功能B");
  }
}
