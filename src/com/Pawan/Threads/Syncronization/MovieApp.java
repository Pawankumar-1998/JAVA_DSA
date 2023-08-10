package com.Pawan.Threads.Syncronization;

class TotalEarning extends Thread{
    int total = 0;
    public void run(){
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                total = total + 100;
            }
            this.notify();
        }
    }
}

public class MovieApp {
    public static void main(String[] args) throws InterruptedException {
        TotalEarning obj1 = new TotalEarning();
        obj1.start();
        synchronized (obj1){
            obj1.wait();
        }
        System.out.println("My Total Earnings are " + obj1.total);
    }
}
