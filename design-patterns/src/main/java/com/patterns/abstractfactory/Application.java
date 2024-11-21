package com.patterns.abstractfactory;

import com.patterns.App;
import com.patterns.abstractfactory.uifactory.MacUiFactory;
import com.patterns.abstractfactory.uifactory.UIFactory;
import com.patterns.abstractfactory.uifactory.WindowsUiFactory;
import com.patterns.abstractfactory.uifactory.button.Button;
import com.patterns.abstractfactory.uifactory.checkbox.Checkbox;

public class Application {
    final Button button;
    final Checkbox checkbox;

    public Application(UIFactory uiFactory){
        button = uiFactory.createButton();
        checkbox = uiFactory.createCheckBox();
    }

    public static void main(String[] args) {
        UIFactory uiFactory = new MacUiFactory();
        Application application = new Application(uiFactory);

        application.button.paint();
        application.checkbox.paint();

        UIFactory uiFactory2 = new WindowsUiFactory();
        Application application2 = new Application(uiFactory2);

        application2.button.paint();
        application2.checkbox.paint();
    }
}
