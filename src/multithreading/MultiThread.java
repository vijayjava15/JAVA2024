package multithreading;

import java.util.Date;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("thread is running");
    }
}

/*
 threads can be created using two ways one is extends Thread Class .  another one is using Runnable interface
 Thread class itself implements Runnable interface.

  same way we can do this in functional programming. functional interfaces having only one function. so we can avoid legacy code.


 */
public class MultiThread {

    public static void main(String[] args) throws InterruptedException {
        ////legacy way of creating a new thread
        System.out.println("Hello world");
        MyThread objectThread = new MyThread();
        objectThread.start();


        int i = 10;


        Thread thread = new Thread(() -> {
            System.out.println("thread 2 is running");
            System.out.println(new Date().getTime());
        });
        thread.start();


        Runnable runnableInterface = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread running in runnable interface......");
                try {
                    Thread.sleep(5000000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("thread runnable completed");
            }
        };


        Runnable runnable4 = new Runnable() {
            @Override
            public void run() {

            }
        };

        Thread objThread3 = new Thread(runnableInterface, " thread interface");
        objThread3.start();
       // Thread.sleep(1000);
        System.out.println("thread run completed");
        System.out.println("main thread finished");
    }
}


