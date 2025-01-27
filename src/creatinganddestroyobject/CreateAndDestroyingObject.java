package creatinganddestroyobject;

import java.math.BigInteger;

public class CreateAndDestroyingObject {

    public static void main(String[] args) {

        SingeltonExample singeltonExample = SingeltonExample.getInstance();

        singeltonExample.setValue("vvvvvvvvvvvvvvvvvvvv");

        SingeltonExample singeltonExample1 = SingeltonExample.getInstance();
        System.out.println(singeltonExample1.getValue());

    }
}
