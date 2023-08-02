package com.Projects.LearningProject;

public class World {
    public static void main(String[] args) {

//        creating two object of student object
        Student pawan = new Student(1,1,"P Pawan Kumar",7000);
        Student dinesh = new Student(1,2,"Dinesh Takiri",7000);


        System.out.println(pawan.getStdId());


//        creating two objects of the teacher
        Teacher sujata = new Teacher(1,"Paleti Sujata",40000);
        Teacher manisha = new Teacher(1,"Manisha Yadav",25000);

        System.out.println(manisha.getTcId());


        pawan.payFees(2000);
        System.out.println(pawan.getFeesDue());
        System.out.println(pawan.getTotalFeesPaid());
        pawan.payFees(1000);
        System.out.println(pawan.getFeesDue());
        System.out.println(pawan.getTotalFeesPaid());



        /**
         * violating the rule below
         *         pawan.stdId = dinesh.stdId;
         */


        /**
         * testing the paying limit of the student below
         * if he pays the total fees he cannot pay further or extra amount
         */


        Student rahul = new Student(1,4,"Rahul Pattnaik",8000);
        rahul.payFees(8000);
        System.out.println(rahul.getFeesDue());
        rahul.payFees(1000);


    }
}
