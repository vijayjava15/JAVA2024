package designpattern.factory;

public class VegBurget implements CookBurger{
    @Override
    public void cookBurger() {
        System.out.println(" cooking veg burger");
    }
}
