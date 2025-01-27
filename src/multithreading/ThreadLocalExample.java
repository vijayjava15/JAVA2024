package multithreading;

public class ThreadLocalExample {



    public static void main(String[] args) {
        ThreadLocal<String> userThreadLocal = new ThreadLocal<>();

        ////user login
        var userName1= "vijay";
        var password1= "123456";


        var userName2= "john";
        var password2= "123456";


        Thread newThread = new Thread(() ->{
            System.out.println("thread started for" + userName1);
            userThreadLocal.set(userName1);
            ///logics
            System.out.println("completed logic for " +  userName1);

            System.out.println(userThreadLocal.get());

        });

        Thread newThread1 = new Thread(() ->{
            System.out.println("thread2 started for" + userName2);
            userThreadLocal.set(userName2);
            ///logics
            System.out.println("completed logic for " +  userName2);

            System.out.println(userThreadLocal.get());

        });
    }

}
