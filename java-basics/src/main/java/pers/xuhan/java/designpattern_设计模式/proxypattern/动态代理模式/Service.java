package pers.xuhan.java.designpattern_设计模式.proxypattern.动态代理模式;

class Service implements IService{

    @Override
    public void service() {
        System.out.println("被代理对象执行相关操作");
    }
}