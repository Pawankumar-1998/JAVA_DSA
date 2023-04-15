package com.Pawan.Threads.Practice.Case1;

public class Test extends Thread {
    public void run(){
        System.out.println("Task 1");
    }

    public static void main(String[] args) {
        Test thread = new Test();
        thread.start();
    }


}
