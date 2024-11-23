package com.patterns.prototype;

public abstract class Vehicle implements Cloneable {
    private String engine;
    private String model;
    private Long price;

    public Vehicle(String engine, String model, Long price){
        this.engine = engine;
        this.model = model;
        this.price = price;
    }

    public Long getPrice() {
        return price;
    }

    public String getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    protected Vehicle clone() throws CloneNotSupportedException {
        return (Vehicle) super.clone();
    }
}
