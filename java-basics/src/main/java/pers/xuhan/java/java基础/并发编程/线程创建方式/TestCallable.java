package pers.xuhan.java.java基础.并发编程.线程创建方式;

import pers.xuhan.java.javabasic.并发编程.线程创建方式.CallableDemo;

import java.util.concurrent.FutureTask;

/**
 * @Filename: TestCallable.java
 * @Description: callable线程创建方式
 * @Version: 1.0
 * @Author: han.xu
 * @Email: han.xu@paat.com
 * @date: 2019/6/14 10:14
 */
public class TestCallable {
    public static void main(String[] args){
        pers.xuhan.java.javabasic.并发编程.线程创建方式.CallableDemo callableDemo = new pers.xuhan.java.javabasic.并发编程.线程创建方式.CallableDemo();
        //执行callable方式，需要FutureTask实现类的支持，用来接收运算结果
        FutureTask<Integer> result = new FutureTask<>(callableDemo);
        new Thread(result).start();
        //接收线程运算结果
        try {
            Integer sum = result.get();//当上面的线程执行完后，才会打印结果。跟闭锁一样。所有futureTask也可以用于闭锁
            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/**
 现在Callable接口和实现Runable接口的区别就是，Callable带泛型，其call方法有返回值。使用的时候，需要用FutureTask来接收返回值。而且它也要等到线程执行完调用get方法才会执行，也可以用于闭锁操作。
 */