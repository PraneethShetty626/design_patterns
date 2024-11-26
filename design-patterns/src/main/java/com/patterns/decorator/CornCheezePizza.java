package com.patterns.decorator;

public class CornCheezePizza extends PizzaDecorator{
    CornCheezePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return super.bake() + " corn cheese ";
    }
}
