package pers.xuhan.java.java基础.并发编程.等待唤醒机制.虚假唤醒问题;

//店员
class Clerk{
    private int product = 0;//共享数据
    public synchronized void get(){ //进货
        if(product >= 10){
            System.out.println("产品已满");
        }else {
            System.out.println(Thread.currentThread().getName()+":"+ (++product));
        }
    }
    public synchronized void sell(){//卖货
        if (product <= 0){
            System.out.println("缺货");
        }else {
            System.out.println(Thread.currentThread().getName()+":"+ (--product));
        }
    }
}