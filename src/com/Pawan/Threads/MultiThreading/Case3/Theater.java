package com.Pawan.Threads.MultiThreading.Case3;

public class Theater {
    public static void main(String[] args) {
        TTask1 obj1 = new TTask1();
        TTask2 obj2 = new TTask2();
        obj1.start();
        obj2.start();
    }
}
