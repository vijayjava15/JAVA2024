package DSA;

public class Utility {

   public static  int[] getArray(){
        return new int[]{3,55,6,3345,45,22,111,2,33,1,5};
    }

    public static  int[] getSortedArray(){
        return new int[]{1,2,3,4,5,6,7,8,9};
    }



    public static  int[] getArr(){
        return new int[]{29, 10, 14, 37, 13, 29, 29};
    }

    public static void printArray(int[] arr){
        for (int i=0; i<arr.length;  i++){
            System.out.print(  arr[i] + "  ,");
        }
    }
}
