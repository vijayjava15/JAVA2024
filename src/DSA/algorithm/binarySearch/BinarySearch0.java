package DSA.algorithm.binarySearch;

import DSA.Utility;

public class BinarySearch0 extends Utility {

    public static void main(String[] args) {
        /*
        1,2,3,4,5,6,7,8

        target=8

         mid----7
         left----6
         right ----8
         target==mid?
         return
         target>mid?
         left=mid---7
        targe<mid?
         left>=target?
         */

       int[] arr =  getSortedArray();
        int mid = arr.length/2;
        int left = 0;
        int right = arr.length;
        int targetValue = 5;



    }


    void findValue(int [] arr, int mid , int left , int right, int targetValue){
      if (arr[mid]==targetValue){
          System.out.println("found");
      } else if (arr[mid]>targetValue) {
          right=mid;
      }else {
          left=mid;
      }



    }
}
