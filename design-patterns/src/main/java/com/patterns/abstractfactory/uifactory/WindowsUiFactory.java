package com.patterns.abstractfactory.uifactory;

import com.patterns.abstractfactory.uifactory.UIFactory;
import com.patterns.abstractfactory.uifactory.button.Button;
import com.patterns.abstractfactory.uifactory.button.WindowsButton;
import com.patterns.abstractfactory.uifactory.checkbox.Checkbox;
import com.patterns.abstractfactory.uifactory.checkbox.WindowsCheckBox;

public class WindowsUiFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckBox();
    }
}
