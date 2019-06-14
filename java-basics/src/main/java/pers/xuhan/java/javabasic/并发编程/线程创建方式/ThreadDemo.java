package pers.xuhan.java.javabasic.并发编程.线程创建方式;

public class ThreadDemo extends Thread{//继承Thread类

        public void run(){

        //重写run方法
        }
}


//1】定义Thread类的子类，并重写该类的run()方法，该方法的方法体就是线程需要完成的任务，run()方法也称为线程执行体。
//
//2】创建Thread子类的实例，也就是创建了线程对象
//
//3】启动线程，即调用线程的start()方法
