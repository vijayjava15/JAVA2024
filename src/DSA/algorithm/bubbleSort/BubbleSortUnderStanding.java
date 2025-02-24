package DSA.algorithm.bubbleSort;

import DSA.Utility;

public class BubbleSortUnderStanding extends Utility {
    public static void main(String[] args) {
        int[] arr = getArray();

        for(int i =0; i<arr.length;i++){
             boolean isSwapped = false;
            for (int j=0; j<arr.length -i -1; j++){
                if (arr[j]>arr[j+1]){                     //3,1,9,7
                    int temp = arr[j+1]; //1
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    isSwapped=true;

                }


            }
            if(!isSwapped) break;
        }

        printArray(arr);
    }






}
