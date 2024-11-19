package com.patterns.singelton;

import java.io.*;

public class SingletonBreaker implements Serializable {
    private  static SingletonBreaker singletonBreaker;

    private SingletonBreaker(){

    }

    public static SingletonBreaker singletonBreaker(){
        if(singletonBreaker == null){
            singletonBreaker = new SingletonBreaker();
        }
        return singletonBreaker;

    }

    public static void exampleSerialization() throws IOException, ClassNotFoundException {
        SingletonBreaker singletonBreaker1 = SingletonBreaker.singletonBreaker();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleton.obj"));
        objectOutputStream.writeObject(singletonBreaker1);
        objectOutputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("singleton.obj"));
        SingletonBreaker singletonBreaker2 = (SingletonBreaker) inputStream.readObject();

        System.out.println(singletonBreaker1.hashCode());
        System.out.println(singletonBreaker2.hashCode());

    }

    @Serial
    protected Object readResolve(){
        return  singletonBreaker;
    }
}
