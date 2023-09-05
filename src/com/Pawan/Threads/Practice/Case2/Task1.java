package com.Pawan.Threads.Practice.Case2;

public class Task1 extends Thread {
    public void run(){
        System.out.println("this is one task ");
    }
}

class Main{
    public static void main(String[] args) {
        Task1 thread1 = new Task1();
        thread1.start();

        Task1 thread2 = new Task1();
        thread2.start();
    }
}
