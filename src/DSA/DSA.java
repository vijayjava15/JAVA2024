package DSA;

import java.util.ArrayList;
import java.util.List;

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

    }

}
