package pers.xuhan.java.designpattern_设计模式.proxypattern.静态代理模式;

//测试类
public class ProxyPattern {

    public static void main(String[] args) {
        IService service = new Service();
        //传入被代理类的对象
        ProxyService proxyService = new ProxyService(service);
        proxyService.service();
    }
}