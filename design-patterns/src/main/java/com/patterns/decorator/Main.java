package com.patterns.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new CheesePizza(new AlpinoPizza(new CornCheezePizza(new BasePizza())));

        System.out.println(pizza.bake());
    }
}
