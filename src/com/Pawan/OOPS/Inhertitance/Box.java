package com.Pawan.OOPS.Inhertitance;

public class Box {
     double len;
    double height;
    double width;

    Box(){
        this.len = -4;
        this.height = -1;
        this.width = -1;
    }

    Box(double a){
        this.len = a;
        this.height = a;
        this.width = a;
    }

    Box(double a, double b,double c){
        this.len = a;
        this.width = b;
        this.height = c;
    }

    Box(Box old){
        this.len = old.len;
        this.width = old.width;
        this.height = old.height;
    }

    public void message(){
        System.out.println("This the base class BOX ");
    }
}
