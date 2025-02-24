package designpattern.factory;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        System.out.println(" welcome to vijay hotel what do you want to have today??????????? ");
        Scanner scanner = new Scanner(System.in);
        var input = scanner.next();
        FactoryClass burgerFactory = new FactoryClass();
        burgerFactory.cookBurger(input).cookBurger();
    }
}
