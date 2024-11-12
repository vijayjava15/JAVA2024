package multithreading;

public class ExampleThread extends Thread{

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("my thread is running");
    }




}


class Testing{

    public static void main(String[] args) {

        var i =5;
        for(var j=0;j<=i;j++) {
            ExampleThread exampleThread = new ExampleThread();
            exampleThread.start();
            System.out.println(Thread.currentThread().getName());
        }
    }


}