package pers.xuhan.java.javabasic.并发编程.线程创建方式;

import java.util.concurrent.Callable;

class CallableDemo implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
       int sum = 0;
       for (int i = 0;i<=100;i++){
           sum += i;
       }
       return sum;
    }
}