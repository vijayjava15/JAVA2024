package corejava;

public class StackOverFlowExampple {


    public static void main(String[] args) {
//        for(int i=0; i <1000000;i++){
//           int a =1;
//           i=a+1;
//           a=i+1;
//            System.out.println(i);
//        }
 /* this  wont create a stackoverflow error because
    stack memory is not filled
    like we have only two variables , it has been created in stack and stack reusing it
    effecintly so we need to worry

    like stack has a and i , it is just reusing and updating the value
     */

        /* so wht makes a stockoverFLoe exp*/
        var value = 3;
        addUntilErrorComes(value);
    }


//stack

    //method
    //int,float
    //Integr num
    // Packageifno = new packgaeInfo();
    // String a = 'abc"
    // String a = new String("abc")
   static  void addUntilErrorComes(int num ){

        if (num == 2) {
            System.out.println("number not found");

        }else {
            num++;
            System.out.println("number not found" + num);
            num++;
            addUntilErrorComes(num);
        }
    }

}
