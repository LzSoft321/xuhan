package pers.xuhan.java.designpattern.decoratorpattern;

/**
 * 装饰角色，持有一个构件角色的引用，并且实现构件角色
 * 要想增加功能过后还是这个类型的构件就必须实现构件角色，要想增加功能，就必须持有要被附加功能的构件角色的引用，这就是为什么必须持有一个构件角色的引用
 * @author Administrator
 *
 */
public class Decorator implements Component {
  private Component component;//这是要被附加功能的构件角色，可通过实例化的时候传进来
  public Decorator(Component component) {
    this.component = component;
  }
  @Override
  public void doSomething() {
    component.doSomething();
  }
}