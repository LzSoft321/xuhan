package pers.xuhan.java.designpattern.singletonpattern;

/**
 * @Filename: StaticSingleton.java
 * @Description: 静态内部类：这种方式只适合静态域的情况，实现简单，线程安全，懒加载。
 * @Version: 1.0
 * @Author: han.xu
 * @Email: han.xu@paat.com
 * @date: 2019/5/5 20:37
 */
public class StaticSingleton {
    private static class SingletonHolder{
        private static StaticSingleton instance = new StaticSingleton();
    }
    public static StaticSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
