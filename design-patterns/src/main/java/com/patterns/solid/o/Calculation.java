package com.patterns.solid.o;

public class Calculation {
    public static void main(String[] args) {
        Operation operation = new AddOperation();
        
        System.out.println(operation.operate(1, 0));
    }
}
