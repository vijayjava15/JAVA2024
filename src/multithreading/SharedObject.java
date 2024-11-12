package multithreading;

public class SharedObject {

    private boolean flag = false;

    public synchronized boolean isFlag() {
        return flag;
    }

    public synchronized void setFlag(boolean flag) {
        this.flag = flag;
    }


}


 class VoilataleKeyWord{

     public static void main(String[] args) {


         SharedObject sharedObject = new SharedObject();

         Runnable thread1 = () -> {
             System.out.println("thread 1 started");
             try {
                 Thread.sleep(1000);
                 sharedObject.setFlag(true);
                 System.out.println("shared object value has been set");
                 System.out.println(" thread 1 complete ");
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }


         };


         Thread threadRunnable1 = new Thread(thread1, "RUNNABLE1");
         threadRunnable1.start();


         Runnable thread2 = () -> {
             System.out.println("thread 2 started");
            boolean val =  sharedObject.isFlag();
             while(!sharedObject.isFlag()){
                // System.out.println(" thread 2 complete ");
             }
             System.out.println("thread 2 complete");

         };


         Thread threadRunnable2 = new Thread(thread2, "RUNNABLE2");
         threadRunnable2.start();
     }
}
