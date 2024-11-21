




package com.patterns.factory;





public class WindowsOperatingSystem extends OperatingSystem {

    protected WindowsOperatingSystem(String architecture, String version) {

        super(architecture, version);
    }





    @Override
    public void changeDir(String dir) {

    }





    @Override
    public void removeDir(String dir) {

    }
}
