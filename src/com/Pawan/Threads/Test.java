package com.Pawan.Threads;

import java.lang.Thread;
public class Test extends Thread{  // extend the thread class

//    override the run method of thread
    public void run(){ //--> Running stage of the thread
//        task of the threads to be done here
    } //--> end state of the thread

    public static void main(String[] args) {
//        create a object of class test
        Test t1 = new Test(); //--> Baby thread created
//      this will invoke the run method
        t1.start(); // --> Runnable stage
    }
}
