package multithreading;

public class DaemonThread {

    public static void main(String[] args) throws InterruptedException {

        Object sharedObject = new Object();

       Runnable runnable = () ->{
          int runnable1 =5;
               System.out.println("thread running");
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }

           System.out.println("thread end runnable ");

       };


       Thread thread = new Thread(runnable,"RUNNABLE");
       thread.setDaemon(true);
       thread.start();

        System.out.println(" main thread end");

        Runnable runnable1= () ->{
            int runnable2 =5;
            System.out.println("thread running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("thread end runnable ");

        };




        Thread thread1 = new Thread(runnable,"RUNNABLE");
        thread1.setDaemon(true);
        thread1.start();

    }
}
