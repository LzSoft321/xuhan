package pers.xuhan.java.java基础.并发编程.等待唤醒机制.线程按序交替;

public class TestLoopPrint {
    public static void main(String[] args) {
        AlternationDemo ad = new AlternationDemo();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    ad.loopA();
                }
            }
        }, "A").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    ad.loopB();
                }
            }
        }, "B").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    ad.loopC();
                }
            }
        }, "C").start();
    }
}

//首先来看一道题：
//编写一个程序，开启 3 个线程，这三个线程的 ID 分别为 A、B、C，
//每个线程将自己的 ID 在屏幕上打印 10 遍，要求输出的结果必须按顺序显示。
//如：ABCABCABC…… 依次递归
//
//分析：
//线程本来是抢占式进行的，要按序交替，所以必须实现线程通信，
//那就要用到等待唤醒。可以使用同步方法，也可以用同步锁。

