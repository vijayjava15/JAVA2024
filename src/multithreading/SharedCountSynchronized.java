package multithreading;


import java.util.Date;


public class SharedCountSynchronized{
    private int count = 0;

    public int getIncrement() {
        return count;
    }



    public  void incrementValue(){
        //System.out.println("no more block of method now");
        synchronized (this) {
            count++;
        }
    }
}


class RaceConditionSynchronized{

    public static void main(String[] args) throws InterruptedException {


        SharedCountSynchronized sharedCount = new SharedCountSynchronized();

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


