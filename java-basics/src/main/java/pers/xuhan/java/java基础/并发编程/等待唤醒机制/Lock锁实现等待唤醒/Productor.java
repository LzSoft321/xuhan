package pers.xuhan.java.java基础.并发编程.等待唤醒机制.Lock锁实现等待唤醒;

//生产者
class Productor implements Runnable{
    private LockClerk clerk;
    public Productor(LockClerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run() {
        for (int i = 0;i<20;i++){
            clerk.get();
        }
    }
}