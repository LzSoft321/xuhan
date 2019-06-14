package pers.xuhan.java.java基础.并发编程.等待唤醒机制.虚假唤醒问题;

//店员
class Clerk {
    private int product = 0;//共享数据

    public synchronized void get() { //进货
        if (product >= 10) {
            System.out.println("产品已满");
        } else {
            System.out.println(Thread.currentThread().getName() + ":" + (++product));
        }
    }

    public synchronized void sell() {//卖货
        if (product <= 0) {
            System.out.println("缺货");
        } else {
            System.out.println(Thread.currentThread().getName() + ":" + (--product));
        }
    }
}

/**
 * 这就是生产消费模式的案例，这里没有使用等待唤醒机制，运行结果就是即使是缺货状态，它也会不断的去消费，也会一直打印“缺货”，即使是产品已满状态，也会不断地进货。用等待唤醒机制改进：
 * <p>
 * 这样就不会出现上述问题了。没有的时候就生产，生产满了就通知消费，消费完了再通知生产。但是这样还是有点问题，将上述代码做如下改动：
 */
//店员
//class Clerk{
//    private int product = 0;//共享数据
//    public synchronized void get(){ //进货
//        if(product >= 10){
//            System.out.println("产品已满");
//            try {
//                this.wait();//满了就等待
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }else {
//            System.out.println(Thread.currentThread().getName()+":"+ (++product));
//            this.notifyAll();//没满就可以进货
//        }
//    }
//    public synchronized void sell(){//卖货
//        if (product <= 0){
//            System.out.println("缺货");
//            try {
//                this.wait();//缺货就等待
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }else {
//            System.out.println(Thread.currentThread().getName()+":"+ (--product));
//            this.notifyAll();//不缺货就可以卖
//        }
//    }
//}

/**
 这样就不会出现上述问题了。没有的时候就生产，生产满了就通知消费，消费完了再通知生产。但是这样还是有点问题，将上述代码做如下改动：*/
//if(product >= 1){ //把原来的10改成1
//        System.out.println("产品已满");
//        ......
//public void run() {
//        try {
//        Thread.sleep(200);//睡0.2秒
//        } catch (InterruptedException e) {
//        e.printStackTrace();
//        }
//        for (int i = 0;i<20;i++){
//        clerk.sell();
//        }
//        }

/**就做这两处修改，再次运行，发现虽然结果没问题，但是程序却一直没停下来。
*出现这种情况是因为有一个线程在等待，而另一个线程没有执行机会了，唤醒不了这个等待的线程了，所以程序就无法结束。
 * 解决办法就是把get和sell方法里面的else去掉，不要用else包起来。但是，即使这样，如果再多加两个线程，就会出现负数了。
*/
//new Thread(productor, "生产者C").start();
//new Thread(consumer, "消费者D").start();
/**
 一个消费者线程抢到执行权，发现product是0，就等待，这个时候，另一个消费者又抢到了执行权，product是0，还是等待，此时两个消费者线程在同一处等待。然后当生产者生产了一个product后，就会唤醒两个消费者，发现product是1，同时消费，结果就出现了0和-1。这就是虚假唤醒。解决办法就是把if判断改成while。如下：
*/
//public synchronized void get() { //进货
//    while (product >= 1) {
//        System.out.println("产品已满");
//        try {
//            this.wait();//满了就等待
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//    System.out.println(Thread.currentThread().getName() + ":" + (++product));
//    this.notifyAll();//没满就可以进货
//}
//    public synchronized void sell() {//卖货
//        while (product <= 0) {//为了避免虚假唤醒问题，wait方法应该总是在循环中使用
//            System.out.println("缺货");
//            try {
//                this.wait();//缺货就等待
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println(Thread.currentThread().getName() + ":" + (--product));
//        this.notifyAll();//不缺货就可以卖
//    }
//    只需要把if改成while，每次都再去判断一下，就可以了。