package com.Pawan.Threads.MultiThreading.case1;

import java.lang.Thread;

//single task using single thread
public class Task extends Thread {
    public void run(){
        System.out.println("Book ticket ");
    }

    public static void main(String[] args) {
        Task obj1 = new Task();
        obj1.start();
    }

}
