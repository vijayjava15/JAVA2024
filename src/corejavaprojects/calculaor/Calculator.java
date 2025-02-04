package corejavaprojects.calculaor;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
     int count = 0 ;
    }




    void calculate(int count){
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose operator" + "+ - % *");
        String symbol =  scanner.next();
        if(count>5){
            System.out.println(" do you want to add numbers?");
            var usrDesc = scanner.next();
            if("yes".equals(usrDesc)){
                count++;
                calculate(count);
            }else {
                countValues();
            }
        }
        calculate(count);

    }


    void countValues(){

    }
}
