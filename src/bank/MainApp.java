package bank;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainApp {


    public static void main(String[] args) {

        System.out.println("enter account no");
        Scanner sc = new Scanner(System.in);
        String accountNumber =  sc.next();

        System.out.println("please chooose deposit or withdraw");

        Long amount =  sc.nextLong();

        Deposit deposit = new Deposit();
        deposit.depositMoney(accountNumber,amount);


        String username = "123456";
        String password = "123456";
        String auth = username + ":" + password;
        String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes());
        System.out.println(encodedAuth);
//        String username = "12345";
//        String password = "12345";
//        String auth = username + ":" + password;
//
//        // Encode credentials using Base64Codec
//        String encodedAuth = Base64Codec.BASE64.encode(auth.getBytes());
//
//        // Prepare the Authorization header
//        String authHeader = "Basic " + encodedAuth;
//
//        // Print the Authorization header
//        System.out.println("Authorization: " + authHeader);













    }






    public static  Map<String, Long> getUserInfo(){
        Map<String, Long>  userAmountMap = new HashMap<>();
        userAmountMap.put("123",500l);
        userAmountMap.put("124",100l);
        userAmountMap.put("145",900l);
        return userAmountMap;
    }




}
