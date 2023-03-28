package com.Pawan.Threads.Practice;

public class RTest implements Runnable {

    public void run(){
        System.out.println("This is thread task two");
    }
    public static void main(String[] args) {
        RTest t = new RTest();
        Thread th = new Thread(t);
        th.start();
        th.run();
        t.run();
    }
}
