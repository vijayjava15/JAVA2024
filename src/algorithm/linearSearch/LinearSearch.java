package algorithm.linearSearch;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {3,55,6,3345,45,22,111,2,33,1,5};

        Scanner scanner = new Scanner(System.in);
        var userInput = scanner.nextInt();
        for (var i=0; i<arr.length;i++){
            if (userInput==arr[i]){
                System.out.println("same element found");
            }
        }


    }
}
