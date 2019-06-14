package pers.xuhan.java.java基础.并发编程.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Filename: FixedThreadPool.java
 * @Description: 固定线程池
 * @Version: 1.0
 * @Author: han.xu
 * @Email: han.xu@paat.com
 * @date: 2019/6/13 13:39
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        ThreadPoolDemo tp = new ThreadPoolDemo();
        //1.创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(5);
        //2.为线程池中的线程分配任务
        pool.submit(tp);
        //3.关闭线程池
        pool.shutdown();
    }
}
/**
 我们使用线程时，需要new一个，用完了又要销毁，这样频繁的创建销毁也很耗资源，所以就提供了线程池。
 道理和连接池差不多，连接池是为了避免频繁的创建和释放连接，所以在连接池中就有一定数量的连接，要用时从连接池拿出，用完归还给连接池。
 线程池也一样。线程池中有一个线程队列，里面保存着所有等待状态的线程。
 */