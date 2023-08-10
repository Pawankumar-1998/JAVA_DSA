package com.Pawan.Threads.Syncronization;

public class BookMyShow {
    int total_seat = 10;
    void reserve(int seats){
        if (seats<=total_seat){
            System.out.println("seats booked successfully");
            total_seat = total_seat-seats;
            System.out.println("total seat left are "+total_seat);
        } else {
            System.out.println("sorry there are only " + total_seat + "Seats");
        }
    }
}
