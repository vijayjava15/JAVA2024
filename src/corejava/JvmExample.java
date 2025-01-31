package corejava;

import java.lang.management.MemoryManagerMXBean;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Scanner;

public class JvmExample {


    //Memory management
    //stack and heap -----------JVM

    /*
    stack
    variables inside method
    and method blocks
    and obj refrence will be stored in stack memory
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* i have created a new object of scanner class ,now
        the memory  of this Scanner object will be stored inside heap
        but the refrence of the object will be stored inside the
        stack
         */

        System.out.println(scanner);
        /*
        you can see the memory of the object if you print this.......
         */
     System.gc();


    }



}
