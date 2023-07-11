package com.Pawan.OOPS.Lecture3.Practice;

public class Main {
    public static void main(String[] args) {

//        box is a parent class so can access member of his class
        Box box1 = new Box();
        System.out.println("length is " + box1.l);

//        rectangle is a derived class so as it extends the parent class it has the access to the
//        base class members and the methods
        Rectangle rec1 = new Rectangle();
        System.out.println("length of rec is  " + rec1.l);

//      we can access the member of the class based on the type of reference variable refering to it
//        not on the type of the object created
        Rectangle rec2 = new Rectangle(5,10,12,15);
        System.out.println("length of rec2 is " + rec2.l);
        System.out.println("weight of rec2 is " + rec2.weight);


        Box box3 = new Rectangle();
        System.out.println(box3.l);
        box3.message();

    }
}
