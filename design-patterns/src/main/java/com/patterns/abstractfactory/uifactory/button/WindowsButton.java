package com.patterns.abstractfactory.uifactory.button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button");

    }
}
