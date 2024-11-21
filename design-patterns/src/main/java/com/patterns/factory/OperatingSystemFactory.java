




package com.patterns.factory;





public class OperatingSystemFactory {

    private OperatingSystemFactory() {}





    public static OperatingSystem getInstance(String type, String version, String architecture) {

        switch (type) {
            case "WINDOWS":
                return new WindowsOperatingSystem(version, architecture);
            case "UNIX":
                return new LinuxOperatingSystem(version, architecture);
            default:
                throw new IllegalArgumentException("No supported system");
        }
    }
}
