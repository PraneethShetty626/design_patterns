




package com.patterns.factory;





public abstract class OperatingSystem {

    final String architecture;
    final String version;





    protected OperatingSystem(String architecture, String version) {

        this.architecture = architecture;
        this.version = version;
    }





    public String getArchitecture() {

        return architecture;
    }





    public String getVersion() {

        return version;
    }





    public abstract void changeDir(String dir);





    public abstract void removeDir(String dir);
}
