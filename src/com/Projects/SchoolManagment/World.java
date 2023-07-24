package com.Projects.SchoolManagment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class World {
    public static void main(String[] args) {

        /*
        creating the objects of the teachers
        creating three teachers
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


//        adding the students to the list
        List<Student> studentListDCS = new ArrayList<>();
        studentListDCS.add(dinesh);
        studentListDCS.add(rahul);
        studentListDCS.add(mani);

//        creating a school and sending the teachers and students to the school
        School DeeptiCS = new School(teacherListDCS,studentListDCS);

//        as the school is just created the total revenue will be always 0
        System.out.println("the total revenue of the DCS is : " + DeeptiCS.getTotalRevenue());


//        making a student paying fees
        dinesh.payFees(5000);
        System.out.println("the total revenue of the DCS is : " + DeeptiCS.getTotalRevenue()); // the total revenue should be 5000
        System.out.println("fees paid by " + dinesh.getName() + " is :" + dinesh.getFeesPaid()); // the feesPaid by dinesh should be 5000


//        making another student paying the fees
        rahul.payFees(1000);
        System.out.println("the total revenue of the DCS is : " + DeeptiCS.getTotalRevenue()); // revenu should be 6000
        System.out.println("fees paid by " + rahul.getName() + " is :" + rahul.getFeesPaid());// fees paid by rahul should be 1000


//        System.out.println(studentListDCS);


//        paying the salary to the teacher
            sujata.reciveSalary(sujata.getSalary());

        System.out.println("the salary of " + sujata.getName() + "is " + sujata.getSalary()); // total salary should be 8000

        System.out.println("the total revenue spent by the school is " + DeeptiCS.getRevenueSpent()); // 8000 as the paid the amount to the teacher
        System.out.println("the total  revenue  of  the school is " + DeeptiCS.getTotalRevenue()); // will be in debts of 2000

//        making rahul pay fees
        rahul.payFees(3000);
        System.out.println("the total amount of fees paid by "+rahul.getName()+" is "+rahul.getFeesPaid());
        System.out.println("the total  revenue  of  the school is " + DeeptiCS.getTotalRevenue());

        mani.payFees(8000);
        System.out.println("the total  revenue  of  the school is " + DeeptiCS.getTotalRevenue());

//        paying the salary to the teacher
        manisha.reciveSalary(manisha.getSalary()); // salary of manisha is 6000
        System.out.println("the total revenue spent by the school is " + DeeptiCS.getRevenueSpent()); // 14000 ( 8k + 6k)
        System.out.println("the total  revenue  of  the school is " + DeeptiCS.getTotalRevenue()); // 3000 as salary paid


//      using to string to get the information of the object
        System.out.println(dinesh);
        System.out.println(manisha);

//        checking the revenue of the school and paying salary to the teacher
        System.out.println("the total  revenue  of  the school is " + DeeptiCS.getTotalRevenue());

        // let rahul the fees
        System.out.println(rahul.getFeesPaid()); // 4000
        rahul.payFees(10000);
        System.out.println("the total  revenue  of  the school is " + DeeptiCS.getTotalRevenue()); // 3000 as salary paid

        // paying the salary to the teacher
        manisha.reciveSalary(manisha.getSalary());
        System.out.println("the total  revenue  of  the school is " + DeeptiCS.getTotalRevenue()); // 3000 as salary paid
        System.out.println("total salary recevied by " +  manisha.getName() + " is " + manisha.totalSalaryRecevied());





    }
}
