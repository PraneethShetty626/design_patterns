package com.patterns.decorator;

public class AlpinoPizza extends PizzaDecorator{
    AlpinoPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return super.bake() + "alpinos";
    }
}
