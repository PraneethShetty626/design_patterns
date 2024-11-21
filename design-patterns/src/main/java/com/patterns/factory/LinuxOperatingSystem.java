




package com.patterns.factory;





public class LinuxOperatingSystem extends OperatingSystem {

    protected LinuxOperatingSystem(String architecture, String version) {

        super(architecture, version);
    }





    @Override
    public void changeDir(String dir) {

    }





    @Override
    public void removeDir(String dir) {

    }
}
