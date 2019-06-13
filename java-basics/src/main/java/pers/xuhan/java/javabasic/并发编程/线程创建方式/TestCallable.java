package pers.xuhan.java.javabasic.并发编程.线程创建方式;

import java.util.concurrent.FutureTask;

public class TestCallable {
    public static void main(String[] args){
        CallableDemo callableDemo = new CallableDemo();
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