package DSA.algorithm.bubbleSort;

public class BubbleSort1 {

    public static void main(String[] args) {
//asc
        char[] arr = {'v','i','j','a','y'};
      //  arr[2] = 1111;
        System.out.println(arr);

   for (int i=0; i< arr.length-1;i++){
       boolean isSwapped = false;
       for (int j=0 ; j <arr.length-1; j++){
           if (arr[j]>arr[j+1]){
               char temp = arr[j];//11
               arr[j] = arr[j+1];
               arr[j+1]=temp;
               isSwapped = true;
           }

          if(!isSwapped) break;
       }
   }

      for(int i=0; i< arr.length;i++){
          System.out.print(arr[i]);
          System.out.print(" , ");
      }
    }


}




