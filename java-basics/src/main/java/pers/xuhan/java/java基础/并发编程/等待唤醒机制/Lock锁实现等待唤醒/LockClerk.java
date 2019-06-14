package pers.xuhan.java.java基础.并发编程.等待唤醒机制.Lock锁实现等待唤醒;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockClerk {
    private int product = 0;//共享数据
    private Lock lock = new ReentrantLock();//创建锁对象
    private Condition condition = lock.newCondition();//获取condition实例
    public  void get() { //进货
        lock.lock();//上锁
        try {
            while (product >= 1) {
                System.out.println("产品已满");
                try {
                    condition.await();//满了就等待
                } catch (InterruptedException e) {
                }
            }
            System.out.println(Thread.currentThread().getName() + ":" + (++product));
            condition.signalAll();//没满就可以进货
        }finally {
            lock.unlock();//释放锁
        }
    }

    public  void sell() {//卖货
        lock.lock();//上锁
        try {
            while (product <= 0) {
                System.out.println("缺货");
                try {
                    condition.await();//缺货就等待
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + ":" + (--product));
            condition.signalAll();//不缺货就可以卖
        }finally {
            lock.unlock();//释放锁
        }
    }
}