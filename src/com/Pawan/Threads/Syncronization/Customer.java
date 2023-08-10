package com.Pawan.Threads.Syncronization;

public class Customer extends Thread{
    int seats;
    static BookMyShow obj;
    public void run(){
        obj.reserve(seats);
    }

    public static void main(String[] args) {
        obj = new BookMyShow();
        Customer thread1 = new Customer();
        thread1.seats = 7;
        thread1.start();

        Customer thread2 = new Customer();
        thread2.seats=8;
        thread2.start();
    }

}
