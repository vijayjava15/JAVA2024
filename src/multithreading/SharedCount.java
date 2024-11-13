package multithreading;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class SharedCount {
    private AtomicInteger count = new AtomicInteger(0); ;

    public int getIncrement() {
        return count.get();
    }



    public  void incrementValue(){
        count.getAndIncrement();
    }
}


class RaceCondition{

    public static void main(String[] args) throws InterruptedException {


        SharedCount sharedCount = new SharedCount();

        new Thread(() -> {
            System.out.println("thread 1 started");
            for(var i=0;i<50000;i++){
                sharedCount.incrementValue();
            }
            System.out.println("thread 1 completed");
            System.out.println(Thread.currentThread().getName());
            System.out.println(new Date().getTime());
        }).start();




        new Thread(() -> {
            System.out.println("thread 2 started");
            for(var i=0;i<50000;i++){
                sharedCount.incrementValue();
            }
            System.out.println("thread 2 completed");
            System.out.println(Thread.currentThread().getName());
            System.out.println(new Date().getTime());

        }).start();

        int value = sharedCount.getIncrement();
        Thread.sleep(1000);
        System.out.println("value is " + sharedCount.getIncrement());
        System.out.println(Thread.currentThread().getName());
        System.out.println(new Date().getTime());
    }
}
