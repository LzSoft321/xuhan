package pers.xuhan.java.designpattern_设计模式.singletonpattern;

/**
 * @Filename: SignletonDoubleLock.java
 * @Description: 双重校验锁：实现较复杂，性能高，线程安全，实现了懒加载
 * @Version: 1.0
 * @Author: han.xu
 * @Email: han.xu@paat.com
 * @date: 2019/5/5 20:51
 */
public class SignletonDoubleLock {
    private volatile static SignletonDoubleLock singleton = null;
    private SignletonDoubleLock(){
        System.out.println("SignletonDoubleLock is create");
    }
    public static SignletonDoubleLock getSingleton(){
        if(singleton == null){
            synchronized (SignletonDoubleLock.class){
                if(singleton == null){
                    singleton = new SignletonDoubleLock();
                }
            }
        }
        return  singleton;
    }
}
