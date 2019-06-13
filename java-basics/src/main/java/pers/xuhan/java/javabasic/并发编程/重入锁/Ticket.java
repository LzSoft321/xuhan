package pers.xuhan.java.javabasic.并发编程.重入锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Filename: Ticket.java
 * @Description:  重入锁
 * @Version: 1.0
 * @Author: han.xu
 * @Email: han.xu@paat.com
 * @date: 2019/6/13 14:20
 */
class Ticket implements Runnable {
    private Lock lock = new ReentrantLock();//创建lock锁
    private int ticket = 100;
    @Override
    public void run() {
        while (true) {
            lock.lock();//上锁
            try {
                if (ticket > 0) {
                        Thread.sleep(200);
                    System.out.println(Thread.currentThread().getName() + "完成售票，余票为：" + (--ticket));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();//释放锁
            }

        }
    }
}

//class Ticket implements Runnable {
//    private int ticket = 100;
//    @Override
//    public void run() {
//        while (true) {
//            if (ticket > 0) {
//                try {
//                    Thread.sleep(200);
//                } catch (Exception e) {
//                }
//                System.out.println(Thread.currentThread().getName() + "完成售票，余票为：" + (--ticket));
//            }
//        }
//    }
//}