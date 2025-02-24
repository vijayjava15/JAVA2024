package designpattern.factory;

public class ChickenBurger implements CookBurger{
    @Override
    public void cookBurger() {
        System.out.println(" cooking chicken burger");
    }
}
