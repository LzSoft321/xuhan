package pers.xuhan.java.java基础.并发编程.线程创建方式;


/**
 * @Filename: TestRunnable.java
 * @Description: Runnable 测试
 * @Version: 1.0
 * @Author: han.xu
 * @Email: han.xu@paat.com
 * @date: 2019/6/14 10:28
 */
public class TestRunnable {
    //创建并启动线程

    public static void main(String[] args) {

        RunnableDemo runnableDemo=new RunnableDemo();
        Thread thread=new Thread(runnableDemo);
        thread.start();
    }
}
//1】定义Runnable接口的实现类，一样要重写run()方法，这个run（）方法和Thread中的run()方法一样是线程的执行体
//
//2】创建Runnable实现类的实例，并用这个实例作为Thread的target来创建Thread对象，这个Thread对象才是真正的线程对象
//
//3】第三部依然是通过调用线程对象的start()方法来启动线程
