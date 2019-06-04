package pers.xuhan.java.designpattern_设计模式.singletonpattern_单例;

/**
 * @Filename: Singleton.java
 * @Description: 单例模式: 创建简单可靠，缺点是JVM加载单例类的时候，单例对象就会被创建，没有实现延迟加载。
 * @Version: 1.0
 * @Author: han.xu
 * @Email: han.xu@paat.com
 * @date: 2019/5/5 20:09
 */
public class Singleton {

    private Singleton(){
        System.out.println("Singleton is create");//注意创建单例过程可能比较慢
    }
    private static Singleton instance = new Singleton();
    public  static Singleton getInstance(){
        return instance;
    }
}
