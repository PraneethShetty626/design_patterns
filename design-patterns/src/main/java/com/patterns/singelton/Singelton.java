




package com.patterns.singelton;





public class Singelton {

    private static Singelton instance;

    private static Singelton threadSafeinstance = new Singelton();





    private Singelton() {}





    /** Not thread safe */
    public static Singelton getInstance() {

        if (instance == null) {
            instance = new Singelton();
        }
        return instance;
    }





    public static Singelton getThreadSafe() {

        return threadSafeinstance;
    }
}
