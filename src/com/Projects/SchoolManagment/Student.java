package com.Projects.SchoolManagment;

import com.Projects.SchoolManagment.School;

/*
    This class is responsible for student object

 */
public class Student {


    private int stdId;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalFees;

    public Student(int stdId , String name , int grade){

        this.feesPaid = 0;
        this.totalFees = 60000;
        this.stdId = stdId;
        this.name = name;
        this.grade = grade;

    }


    /**
     * the below function is used to change / update the grade
     * @param grade
     */
    public void setGrade(int grade){
        this.grade = grade;
    }


    /**
     * the below function is used to update the fees
     * @param fees
     */
    public void payTheFees(int fees){
        this.feesPaid = this.feesPaid + fees;
        this.totalFees = this.totalFees - this.feesPaid;
    }

    public int getStdId() {
        return stdId;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getTotalFees() {
        return totalFees;
    }


    /**
     * the below function is used to pay the fees to the school
     *
     */

    public void  payFees(int payingFees){
        this.feesPaid+=payingFees;
        School.updateTotalRevenue(feesPaid);
    }

    public int remainingFees(){
        return totalFees - feesPaid;
    }
}
