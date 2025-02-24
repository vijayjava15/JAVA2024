package designpattern.factory;

import java.util.Locale;

public class FactoryClass {

    CookBurger cookBurger(String request){

        if (request==null && request.isBlank()){
            throw new RuntimeException("nulll value");
        }
        return switch (request.toLowerCase(Locale.ROOT)) {
            case "beef" -> new BeefBurger();
            case "chicken" -> new ChickenBurger();
            case "veg" -> new VegBurget();
            default -> throw new IllegalArgumentException("Unknown burger type: " + request);
        };

    }
}
