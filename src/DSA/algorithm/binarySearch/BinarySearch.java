package DSA.algorithm.binarySearch;

import DSA.Utility;

import java.awt.*;
import java.util.Scanner;

public class BinarySearch extends Utility {

    public static void main(String[] args) {
        int[] arr = getSortedArray();

      /* binary search 1, 2,3 ,4 , 5,6 ,7 8
      will split the array first and make sure
       */
        System.out.println("enter the value you want to search");
        Scanner scanner = new Scanner(System.in);
        var userInput = scanner.nextInt();
        var length = arr.length;
        int startingPoint = 0;
        var splitOff = length/2;//4
        if (arr[splitOff]>=userInput){//4 >=8
            length=splitOff;
        }else {
            startingPoint=splitOff;
        }
        for (var i= startingPoint; i < length; i++) {
          if (userInput==arr[i]){
              System.out.println("suceed we got the number");
          }
        }
    }

    Rectangle rectangle;

}
