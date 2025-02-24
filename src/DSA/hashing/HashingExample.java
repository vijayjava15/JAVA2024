package DSA.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashingExample {


    public static void main(String[] args) {
        //Hashing Example

        int[] arr = {2, 3, 4, 2, 1, 1, 1, 1, 1, 1, 5, 6, 7, 8, 9, 9, 9, 911, 1, 1, 1, 1};
        Map<Integer, Integer> countValueMap = new HashMap<>();

        for (var i = 0; i < arr.length; i++){
            if (!countValueMap.containsKey(arr[i])){
                countValueMap.put(arr[i], 1);
            }
            countValueMap.put(arr[i], countValueMap.get(arr[i])+1);
        }

        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        var targetNumber = sc.nextInt();
        System.out.println(countValueMap.get(targetNumber));
    }
}
