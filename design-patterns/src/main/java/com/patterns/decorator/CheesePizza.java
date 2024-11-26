package com.patterns.decorator;

public class CheesePizza extends PizzaDecorator{
    CheesePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return super.bake() + " cheese";
    }
}
