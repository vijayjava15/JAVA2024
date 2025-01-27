package bank;

import java.util.Map;

public class Deposit {

    public void depositMoney(String accountNo, Long depositAmount){

            Map<String, Long> userInfov = MainApp.getUserInfo();

          Long amount =   userInfov.getOrDefault(accountNo,null);

          if(amount==null){
              System.out.println("wrong" );
          }

        System.out.println(amount+depositAmount);
    }



}
