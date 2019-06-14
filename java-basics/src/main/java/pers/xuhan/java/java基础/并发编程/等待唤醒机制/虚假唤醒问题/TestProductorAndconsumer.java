package pers.xuhan.java.java基础.并发编程.等待唤醒机制.虚假唤醒问题;

public class TestProductorAndconsumer {
    public static void main(String[] args){
           Clerk clerk = new Clerk();
           Productor productor = new Productor(clerk);
           Consumer consumer = new Consumer(clerk);
           new Thread(productor,"生产者A").start();
           new Thread(consumer,"消费者B").start();
    }
}
