package multithreading;

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

    public static void main(String[] args) {


        SharedCount sharedCount = new SharedCount();

        new Thread(() -> {
            System.out.println("thread 1 started");
            for(var i=0;i<50000;i++){
                sharedCount.incrementValue();
            }
            System.out.println("thread 1 completed");
        }).start();




        new Thread(() -> {
            System.out.println("thread 2 started");
            for(var i=0;i<50000;i++){
                sharedCount.incrementValue();
            }
            System.out.println("thread 2 completed");
            System.out.println("value is " + sharedCount.getIncrement());
        }).start();



    }
}
