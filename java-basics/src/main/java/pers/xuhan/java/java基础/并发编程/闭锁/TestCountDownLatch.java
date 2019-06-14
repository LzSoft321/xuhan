package pers.xuhan.java.java基础.并发编程.闭锁;

public class TestCountDownLatch {
    public static void main(String[] args){
        LatchDemo ld = new LatchDemo();
        long start = System.currentTimeMillis();
        for (int i = 0;i<10;i++){
            new Thread(ld).start();
        }
        long end = System.currentTimeMillis();
        System.out.println("耗费时间为："+(end - start)+"秒");
    }
}

//java.util.concurrent包中提供了多种并发容器类来改进同步容器的性能。ContDownLatch是一个同步辅助类，在完成某些运算时，只有其他所有线程的运算全部完成，当前运算才继续执行，这就叫闭锁。
//这段代码就是10个线程同时去输出5000以内的偶数，然后在主线程那里计算执行时间。
//其实这是计算不了那10个线程的执行时间的，因为主线程与这10个线程也是同时执行的，可能那10个线程才执行到一半，主线程就已经输出“耗费时间为x秒”这句话了。
//所有要想计算这10个线程执行的时间，就得让主线程先等待，等10个分线程都执行完了才能执行主线程。这就要用到闭锁。