package com.Pawan.Threads;
import java.lang.Thread;
class A extends Thread
{
    public void run()
    {
        System.out.println("Thread A started");
        for(int i=1;i<=4;i++)
        {
            System.out.println("\t From ThreadA: i= "+i);
        }
        System.out.println("Exit from A");
    }
}
class B extends Thread
{
    public void run()
    {
        System.out.println("Thread B started");
        for(int j=1;j<=4;j++)
        {
            System.out.println("\t From ThreadB: j= "+j);
        }
        System.out.println("Exit from B");
    }
}
class C extends Thread
{
    public void run()
    {
        System.out.println("Thread C started");
        for(int k=1;k<=4;k++)
        {
            System.out.println("\t From ThreadC: k= "+k);
        }
        System.out.println("Exit from C");
    }
}


public class Test2 {
    public static void main(String[] args) {
    A thread1 = new A();
    B thread2 = new B();
    C thread3 = new C();
    thread3.setPriority(Thread.MAX_PRIORITY);
    thread2.setPriority(thread1.getPriority()+1);
    thread3.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Started Thread A");
        thread1.start();
        System.out.println("Started Thread B");
        thread2.start();
        System.out.println("Started Thread C");
        thread3.start();
        System.out.println("End of main thread");

    }
}
