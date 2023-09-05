package com.Pawan.Threads.Practice.Case3;

public class Main {
    public static void main(String[] args) {
        Task1 thread1 = new Task1();
        thread1.start();

        Task2 thread2 = new Task2();
        thread2.start();
    }
}
