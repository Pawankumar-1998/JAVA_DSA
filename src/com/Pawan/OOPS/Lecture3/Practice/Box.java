package com.Pawan.OOPS.Lecture3.Practice;

public class Box {
    double l;
    double w;
    double h;

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }


    Box(double l , double w , double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void message(){
        System.out.println("This is message of the box class which is the base / parent class ");
    }

}
