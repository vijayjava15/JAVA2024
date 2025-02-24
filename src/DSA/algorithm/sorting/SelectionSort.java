package DSA.algorithm.sorting;

import DSA.Utility;

public class SelectionSort extends Utility {

    public static void main(String[] args) {
        //selection Sort Example

        int[] arr = getArr();

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp =  arr[minIndex];  //1    // [3,4,1]
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

         printArray(arr);
    }
}
