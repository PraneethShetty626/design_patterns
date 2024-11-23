




package com.patterns.prototype;





public class FourWheelerVehicle extends Vehicle {

    private boolean automeatic;
    private boolean isDiesel;





    public FourWheelerVehicle(String engine, String model, Long price, boolean isDiesel, boolean automeatic) {

        super(engine, model, price);
        this.isDiesel = isDiesel;
        this.automeatic = automeatic;
    }





    public boolean isAutomeatic() {

        return automeatic;
    }





    public boolean isDiesel() {

        return isDiesel;
    }





    public void setAutomeatic(boolean automeatic) {

        this.automeatic = automeatic;
    }





    public void setDiesel(boolean diesel) {

        isDiesel = diesel;
    }





    @Override
    protected FourWheelerVehicle clone() throws CloneNotSupportedException {

        return (FourWheelerVehicle) super.clone();
    }
}
