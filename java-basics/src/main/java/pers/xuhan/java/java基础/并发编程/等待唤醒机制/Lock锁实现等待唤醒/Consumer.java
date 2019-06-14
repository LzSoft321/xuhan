package pers.xuhan.java.java基础.并发编程.等待唤醒机制.Lock锁实现等待唤醒;

//消费者
class Consumer implements Runnable{
    LockClerk clerk;
    public Consumer(LockClerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run() {
        for (int i = 0;i<20;i++){
            clerk.sell();
        }
    }
}