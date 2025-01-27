package bank;

import java.util.Scanner;

public class RagelAssignment {

    public static void main(String[] args) {
        int secretNumber = 13;
        int userTry=0;

        userTry(secretNumber, userTry);
    }



   static void userTry(int secretNumber, int userTry){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("hey user try the secret number");
//        int userInput = scanner.nextInt();
//        if (secretNumber==userInput){
//            System.out.println("congrats");
//            userTry=+userTry+1;
//        }else {
//            userTry = userTry + 1;
//            if (userTry>5 && userTry<10){
//                System.out.println("secret number between 10 to 20");
//                userTry(secretNumber,userTry);
//            } else if (userTry>10) {
//                System.out.println("better luck next time");
//
//            }else {
//                userTry(secretNumber, userTry);
//            }
//
//        }

       System.out.println(userTry+1);
   userTry(secretNumber, userTry+1);

    }
}
