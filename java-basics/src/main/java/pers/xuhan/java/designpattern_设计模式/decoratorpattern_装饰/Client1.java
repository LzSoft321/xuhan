package pers.xuhan.java.designpattern_设计模式.decoratorpattern_装饰;

public class Client1 {
  public static void main(String[] args) {
    Component component = new ConcreteComponent();//具体构建角色
    Component component2 = new ConcreteDecorator1(component);//对component这个构件进行装饰
    Component component3 = new ConcreteDecorator2(component2);//对component2这个构件进行装饰
    component3.doSomething();
  }
}