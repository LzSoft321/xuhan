package pers.xuhan.java.designpattern_设计模式.proxypattern_代理.静态代理模式;

/**
 * 代理类
 */
class ProxyService implements IService{
    /**
     * 持有被代理对象的引用
     */
    private IService service;

    /**
     * 默认代理Service类
     */
    public ProxyService() {
        this.service = new Service();
    }

    /**
     * 也可以代理实现相同接口的其他类
     * @param service
     */
    public ProxyService(IService service) {
        this.service = service;
    }

    @Override
    public void service() {
        System.out.println("开始执行service()方法");
        service.service();
        System.out.println("service()方法执行完毕");
    }
}