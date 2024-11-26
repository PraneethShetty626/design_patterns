package com.patterns.decorator;

public class BasePizza implements Pizza {

    @Override
    public String bake() {
        return "Base pizza " ;
    }
}
