package com.patterns.singelton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/**
 * Can use enums to fix this issue*/
public class ReflectionSingletonBreaker {
    private static ReflectionSingletonBreaker instance;

    private ReflectionSingletonBreaker(){}

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor[] constructors = ReflectionSingletonBreaker.class.getDeclaredConstructors();

        Constructor constructor = constructors[0];

        constructor.setAccessible(true);

        ReflectionSingletonBreaker instance = (ReflectionSingletonBreaker) constructor.newInstance();

        System.out.println(instance.hashCode());
        System.out.println(getInstance().hashCode());

        EnumSingleton.INSTANCE.doSomething();

    }



    public static ReflectionSingletonBreaker getInstance(){
        if(instance == null){
            instance = new ReflectionSingletonBreaker();
        }
        return  instance;
    }
}


enum EnumSingleton {
    INSTANCE;

    public void  doSomething(){
        System.out.println("Done");
    }
}