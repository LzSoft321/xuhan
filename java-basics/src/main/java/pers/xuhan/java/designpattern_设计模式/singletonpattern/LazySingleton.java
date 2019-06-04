package pers.xuhan.java.designpattern_设计模式.singletonpattern;

/**
 * @Filename: LazySingleton.java
 * @Description: 单例模式懒加载：考虑到同步的问题加了synchronized进行同步，性能较差。
 * @Version: 1.0
 * @Author: han.xu
 * @Email: han.xu@paat.com
 * @date: 2019/5/5 20:24
 */
public class LazySingleton {
    private LazySingleton(){
        System.out.println("Singleton is create");//注意创建单例过程可能比较慢
    }
    private static   LazySingleton instance = null;
    public static synchronized LazySingleton getInstance(){
        if(instance==null)
            instance = new LazySingleton();
        return instance;
    }
}
