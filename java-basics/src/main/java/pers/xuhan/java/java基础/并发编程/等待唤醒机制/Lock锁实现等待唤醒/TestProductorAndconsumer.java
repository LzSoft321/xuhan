package pers.xuhan.java.java基础.并发编程.等待唤醒机制.Lock锁实现等待唤醒;

public class TestProductorAndconsumer {
    public static void main(String[] args){
          LockClerk clerk = new LockClerk();
           Productor productor = new Productor(clerk);
           Consumer consumer = new Consumer(clerk);
           new Thread(productor,"生产者A").start();
           new Thread(consumer,"消费者B").start();
    }
}
