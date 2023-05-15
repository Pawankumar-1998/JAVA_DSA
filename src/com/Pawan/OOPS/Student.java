package com.Pawan.OOPS;

public class Student {
    int rollNo;
    String name;
    Float total;

    Student(int rollNo , String naam , Float totalmarks ){
        this.rollNo = rollNo;
        this.name = naam;
        total = totalmarks;
    }

    public static void main(String[] args) {
        Student obj1 = new Student(20,"pawan",70.0f);
        System.out.println(obj1.rollNo);
    }
}
