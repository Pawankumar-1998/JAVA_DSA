package com.Pawan.OOPS.Lecure2.SingaltonClass;

//means you can only create one object of the class
public class Singleton {
    private Singleton(){

    }
//    if any object is created store the value in the instance variable
    private static Singleton instance;
    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
