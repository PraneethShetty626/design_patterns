package com.patterns.abstractfactory.uifactory;

import com.patterns.abstractfactory.uifactory.button.Button;
import com.patterns.abstractfactory.uifactory.button.MacButton;
import com.patterns.abstractfactory.uifactory.checkbox.Checkbox;
import com.patterns.abstractfactory.uifactory.checkbox.MacCheckBox;

public class MacUiFactory implements  UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacCheckBox();
    }
}
