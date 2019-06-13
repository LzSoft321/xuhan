package pers.xuhan.java.javabasic.并发编程.读写锁;

/**
 * @Filename: TestReadWriterLock.java
 * @Description: 读写锁
 * @Version: 1.0
 * @Author: han.xu
 * @Email: han.xu@paat.com
 * @date: 2019/6/13 13:47
 */
public class TestReadWriterLock {
    public static void main(String[] args){
           ReadWriterLockDemo rw = new ReadWriterLockDemo();
           new Thread(new Runnable() {//一个线程写
               @Override
               public void run() {
                   rw.set((int)Math.random()*101);
               }
           },"write:").start();
           for (int i = 0;i<100;i++){//100个线程读
               Runnable runnable = () -> rw.get();
               Thread thread = new Thread(runnable);
               thread.start();
           }
    }
}
/**
说明：我们在读数据的时候，可以多个线程同时读，不会出现问题，但是写数据的时候，如果多个线程同时写数据，那么到底是写入哪个线程的数据呢？
    所以，如果有两个线程，写写/读写需要互斥，读读不需要互斥。这个时候可以用读写锁。
 */

