package com.Projects.LearningProject;

public class Student {
    private int stdId;
    private int Grade;
    private String name;

    private int totalFees;

    private int feesDue ;

    private int totalFeesPaid;

    public Student(int stdId , int grade , String name , int totalFees){
        this.stdId = stdId;
        this.Grade = grade;
        this.name = name;
        this.totalFees = totalFees;
        this.feesDue = totalFees;
        this.totalFeesPaid= 0;
    }


    public String getName(){
        return name;
    }

    public int getStdId() {
        return stdId;
    }

    public int getGrade() {
        return Grade;
    }

    /**
     * this below method is used when the student gets promoted to the next class
     *
     */

    public void setGrade(int grade){
        Grade = grade;
    }

    /**
     * this below method is used to get the total fee of the student
     *
     */

    public int getTotalFees(){
        return totalFees;
    }

    public int getFeesDue() {
        return feesDue;
    }


    /**
     * below method is used when the student is paying the fees
     */

    public void payFees(int payingAmount){
        if(totalFeesPaid<totalFees) {
            feesDue = feesDue - payingAmount;
            totalFeesPaid = totalFeesPaid + payingAmount;
            System.out.println("Payment done Successfully !");
        } else {
            System.out.println("Already Paid the full Amount !");
        }
    }

    public int getTotalFeesPaid() {
        return totalFeesPaid;
    }
}
