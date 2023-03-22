package com.Pawan.OOPS.Lecture1;

public class Main {
    public static void main(String[] args) {

//        creating a instance of the class (i.e object )
        Student pawan = new Student(); // object1
        /* Description of the above line
        1. pawan is the reference variable which is located in stack memory but will be pointing
           to the object in the heap memory
        2. the "new" keyword is used to dynamically allocate the memory for the object
        3. Student() is a default constructor called when the object is created
         */
        pawan.roll = 23;
//        pawan.name = "P pawan Kumar";
        pawan.percentage = 93.5f;
        System.out.println(pawan.roll);
        System.out.println(pawan.name);

//        ---------------------------------------------------
        Student dinesh = new Student(); // object 2
        dinesh.name = "jhio brother";
        System.out.println(dinesh.school);
        dinesh.school = " Sacred hear school";
        System.out.println(dinesh.school);

//        ---------------------------------------------------
//        using the parameterized constructor
        Student rahul = new Student(52,"Rahul Rana",65.9f);

//        ----------------------------------------------------
        Student jhio = new Student(dinesh);
        System.out.println(jhio.name);

//        final keyword
        final int a = 10;
         Student jhio1 = new Student();
        jhio1.name = "new Jhio";
        jhio.roll = 20;
        




    }
}
// creating a class
 class Student{
    int roll;
    String name ;
    float percentage;  // these are instance variable
    String school ;

    Student(){
        this.name = "Pawan";
        this.roll = 20;
        this.percentage = 93.5f;
        this.school = "Deepti Convent School";
    }
//     parameterized constructor
    Student(int roll , String name , float percentage){
        this.roll = roll;
        this.name = name;
        this.percentage = percentage;
    }

//    Copy constructor (i.e passing the object as a argument )
    Student(Student other){
        this.name = other.name;
        this.roll = other.roll;
        this.percentage = other.percentage;
        this.school = other.school;
    }
 }