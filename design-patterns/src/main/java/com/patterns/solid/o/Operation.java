package com.patterns.solid.o;

public interface Operation  {
    public int operate(int a, int b);
}


class AddOperation implements Operation {
    public int operate(int a, int b) {
        return a+b;
    }
}


class SubOperation implements Operation {
    public int operate(int a, int b) {
        return a+b;
    }
}