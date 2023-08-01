package com.Projects.LearningProject;

public class Teacher {
    private final int tcId;
    private String name;
    private int salary;

    private int totalSalaryReacived ;

    public Teacher(int tcId , String name , int salary){
        this.tcId = tcId;
        this.name = name;
        this.salary = salary;
        this.totalSalaryReacived = 0;
    }


    public int getTcId(){
        return tcId;
    }

    public int getSalary(){
        return salary;
    }




}
