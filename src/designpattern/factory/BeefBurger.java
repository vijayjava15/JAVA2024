package designpattern.factory;

public class BeefBurger implements CookBurger{


    @Override
    public void cookBurger() {
        System.out.println(" cooking beef burger");
    }
}
