package com.patterns.prototype;

public class TwoWheelerVehicle extends Vehicle{
    private boolean isElectric;
    public TwoWheelerVehicle(String engine, String model, Long price,boolean isElectric) {
        super(engine, model, price);
        this.isElectric = isElectric;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    protected TwoWheelerVehicle clone() throws CloneNotSupportedException {
        return (TwoWheelerVehicle)super.clone();
    }
}
