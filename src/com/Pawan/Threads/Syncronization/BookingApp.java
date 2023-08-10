package com.Pawan.Threads.Syncronization;
class Reservation {
    int totalSeats = 10;
    void bookSeats(int seats){
        if (seats<=totalSeats){
            System.out.println("Ticket booked succesfully ");
            totalSeats-=seats;
            System.out.println("Only  seats left are "+totalSeats);
        } else {
            System.out.println("HouseFull");
            totalSeats-=seats;
            System.out.println("Only  seats left are "+totalSeats);
        }
    }
}


public class BookingApp extends Thread {
    static Reservation b;
    int seats;
    public void run(){
        b.bookSeats(seats);
    }
    public static void main(String[] args) {
        b = new Reservation();
         BookingApp pawan = new BookingApp();
         pawan.setPriority(Thread.MAX_PRIORITY);
         pawan.seats = 6;
         pawan.start();

         BookingApp dinesh = new BookingApp();
         dinesh.seats = 8;
         dinesh.start();

    }
}
