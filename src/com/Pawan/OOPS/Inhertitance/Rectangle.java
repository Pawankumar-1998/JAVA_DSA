package com.Pawan.OOPS.Inhertitance;

public class Rectangle extends Box {

    double l;
    public Rectangle(){
        this.l = -2;
    }
    public Rectangle(double a , double b , double c , double d){
    super(a,b,c);
    this.l = d;
    }


}
