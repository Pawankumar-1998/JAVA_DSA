package com.Pawan.OOPS.Lecture1;

public class Main {
    public static void main(String[] args) {

        /*
        below object is created of the class and new keyword is used to dynamically allocate the
        memory reference variables are in stack memory and objects are in the heap memory
         */
    Student pawan = new Student(25, "kumar",96.5f);
//        pawan.rollNo; accessing the data member of class using dot operator through object
//        System.out.println(pawan.rollNo);
//        System.out.println(pawan.name);
//        System.out.println(pawan.marks);

//        using parameterized constructor
        System.out.println(pawan.rollNo);
        System.out.println(pawan.name);
        System.out.println(pawan.marks);

//        creating a new object
//        Student rahul = new Student();
//        System.out.println(rahul.rollNo);
//        System.out.println(rahul.name);
//        System.out.println(rahul.marks);

        Student pawan1 = new Student(20,"pawan",85.0f);
//        System.out.println(random.name);

    }
}

// creating a class .
//class is a collection of data members and member functions
class Student{
    int rollNo; //  these are data members
    String name;
    float marks;

//    default constructor
//    Student(){
////        calling a constructor in a constructor using this keyword
//        this(3,"suman",65.4f);
//    }

    Student(int  roll, String naam , float mark){
        this.rollNo = roll;
        this.name = naam;
        this.marks = mark;
    }
}

