package com.patterns.decorator;

public abstract  class PizzaDecorator implements Pizza {
    private Pizza pizza;

    PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String bake() {
        return pizza.bake();
    }
}
