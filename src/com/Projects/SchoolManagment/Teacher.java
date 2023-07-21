package com.Projects.SchoolManagment;

public class Teacher {
    private int id;
    private String name;
    private static int salary;

    /**
     * when the object is created
     * @param id used to set the id of the object
     * @param name used to set the name of the object
     * @param salary used to the salary of the object
     */
    public Teacher(int id , String name , int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salary;
    }


    public static void setSalary(int salarypaid){
        salary = salarypaid;
    }
}
