package pers.xuhan.java.java基础.并发编程.重入锁;

import pers.xuhan.java.javabasic.并发编程.重入锁.Ticket;

public class TestLock {
    public static void main(String[] args) {
        pers.xuhan.java.javabasic.并发编程.重入锁.Ticket td = new pers.xuhan.java.javabasic.并发编程.重入锁.Ticket();
        new Thread(td, "窗口1").start();
        new Thread(td, "窗口2").start();
        new Thread(td, "窗口3").start();
    }
}