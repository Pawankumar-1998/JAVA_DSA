package com.Pawan.Threads.MultiThreading.case2;
//single task using multiple thread
import java.lang.Thread;
public class Task extends Thread {
    public void run(){

        System.out.println("book the ticket ");
    }

    public static void main(String[] args) {
//        Task obj = new Task();
        Task obj1 = new Task();
        Task obj2 = new Task();
        obj1.start();
        obj2.start();

//        Thread t1 = new Thread();
//        Thread t2 = new Thread();
//        t1.start();
//        t2.start();
    }
}
