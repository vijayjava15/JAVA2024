package tricky;

import java.util.ArrayList;
import java.util.List;

public class Integer {

    public static void main(String[] args) {
        java.lang.Integer a = 128 ;
        java.lang.Integer  b = 128 ;





        List<java.lang.Integer> test = new ArrayList<>();
        for (int i=1;i<90;i++){
            test.add(i);
        }
       double size = Math.ceil(test.size()/40.0);

        for (int i =0  ; i<size ; i++){
            List<java.lang.Integer> sublist = new ArrayList<>();
            List<java.lang.Integer> index = new ArrayList<>();
            if (test.size()>40){
                sublist  =   new ArrayList<>(test.subList(0,39));
              test.subList(0,39).clear();
            }else{
                sublist =   new ArrayList<>(test.subList(0,test.size()));
            }
            index.add(i);
            System.out.println(sublist);

        }


        if (a==b){
            System.out.println("true");
        }
    }
}
