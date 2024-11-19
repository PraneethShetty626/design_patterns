




package com.patterns.singelton;





public class MultiThreadSingelton {

    private static MultiThreadSingelton instance;





    private MultiThreadSingelton() {}


    public  static  MultiThreadSingelton getInstance(){
        if(instance != null){
            synchronized (MultiThreadSingelton.class){
                if(instance != null){
                    instance = new MultiThreadSingelton();
                }
            }
        }
        return  instance;
    }
}
