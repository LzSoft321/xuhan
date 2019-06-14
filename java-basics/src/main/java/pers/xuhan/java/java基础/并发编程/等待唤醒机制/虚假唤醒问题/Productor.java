package pers.xuhan.java.java基础.并发编程.等待唤醒机制.虚假唤醒问题;

//生产者
class Productor implements Runnable{
    private Clerk clerk;
    public Productor(Clerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run() {
        for (int i = 0;i<20;i++){
            clerk.get();
        }
    }
}