package com.Pawan.Threads.Syncronization;

class Reserver implements Runnable{
    int available = 1;
    int wanted;
    Reserver(int i){
        wanted = i;
    }
    public void run(){
        System.out.println("Available birth =" + available);
        if (wanted<=available){
            String name = Thread.currentThread().getName();
            System.out.println(wanted+"berth reserve for"+name);
            try{
                Thread.sleep(1500);
                available = available-wanted;
            } catch (InterruptedException ie){

            }

        } else {
            System.out.println("Sorry, no berth");
        }
    }
}

public class Dekh {
    public static void main(String[] args) {
        Reserver obj = new Reserver(1);
        Thread t1 = new Thread("Pawan");
        Thread t2 = new Thread("Dinesh");

        t1.start();
        t2.start();
    }
}
