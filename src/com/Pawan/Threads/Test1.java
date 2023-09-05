package com.Pawan.Threads;
import java.lang.Runnable;

//implement the runnable interface
public class Test1 implements Runnable {
//  Override the run method
    public void run(){ //--> Thread Running state
//        task to be done by the thread here
        System.out.println("This is thread task using runnable");
    } //--> dead state

    public static void main(String[] args) {
//        create the object of test
        Test1 obj = new Test1(); //--> Baby thread
//        we should create a object of thread because the runnable interface has only one run
//        and to make the thread run or to send it to running state we need a start method
        Thread t1 = new Thread(obj);
        t1.start(); // this will invoke the run method // --> Runnable stage

    }
}
