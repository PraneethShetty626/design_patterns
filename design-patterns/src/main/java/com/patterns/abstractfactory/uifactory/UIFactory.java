package com.patterns.abstractfactory.uifactory;

import com.patterns.abstractfactory.uifactory.button.Button;
import com.patterns.abstractfactory.uifactory.checkbox.Checkbox;

public interface UIFactory {
    public Button createButton();

    public Checkbox createCheckBox();
}
