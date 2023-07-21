package com.Projects.SchoolManagment;

import java.util.ArrayList;
import java.util.List;

public class World {
    public static void main(String[] args) {

        /*
        creating the objects of the teachers
         */

        Teacher sujata = new Teacher(1,"Sujata",8000);
        Teacher manisha = new Teacher(2,"Manisha",6000);
        Teacher madhuri = new Teacher(3,"Madhuri",5000);

//        adding the teachers to the list
        List<Teacher> teacherListDCS = new ArrayList<>();
        teacherListDCS.add(sujata);
        teacherListDCS.add(manisha);
        teacherListDCS.add(madhuri);


//        creating the objects of the students
        Student dinesh = new Student(1,"Dinesh",4);
        Student rahul = new Student(2,"rahul",4);
        Student mani = new Student(3,"Mani",3);


//        and the students to the list
        List<Student> studentListDCS = new ArrayList<>();
        studentListDCS.add(dinesh);
        studentListDCS.add(rahul);
        studentListDCS.add(mani);

//        this is for school
        School DeeptiCS = new School(teacherListDCS,studentListDCS);
        System.out.println("the total revenue of the DCS is : " + DeeptiCS.getTotalRevenue());

        dinesh.payFees(5000);
        System.out.println("the total revenue of the DCS is : " + DeeptiCS.getTotalRevenue());
        System.out.println("fees paid by " + dinesh.getName() + " is :" + dinesh.getFeesPaid());


        rahul.payFees(1000);
        System.out.println("the total revenue of the DCS is : " + DeeptiCS.getTotalRevenue());
        System.out.println("fees paid by " + rahul.getName() + " is :" + rahul.getFeesPaid());


        System.out.println(studentListDCS);

    }
}
