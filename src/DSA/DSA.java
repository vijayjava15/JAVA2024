package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DSA {
    public static void main(String[] args) {

        List<String> values = new ArrayList<>();
        values.add("vijay");
        values.add("ragel");
        values.add("register");

        for(String v : values){

        }

        System.out.println(values.stream().filter(val->val.equals("vijay")).toString());

        values.stream().map(val->val+"abbc").toArray();
        System.out.println(values.stream().map(val->val+"abbc").toArray());

        Predicate<Integer> predicate = num -> num%2==0;

        int[] arr = {1,2,3,4,5,6,6,7,8,9,0};


     Arrays.stream(arr).filter(predicate::test).toString();

    }

}
