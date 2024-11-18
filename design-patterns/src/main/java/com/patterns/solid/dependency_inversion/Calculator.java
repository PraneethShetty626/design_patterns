




package com.patterns.solid.dependency_inversion;





public class Calculator {

    void calculate(int a, int b, Operation operation) {

        operation.operate(a, b);
    }
}
