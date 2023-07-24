package com.Projects.SchoolManagment;

public class Teacher {
    private int id;
    private String name;
    private  int salary;

    private int salaryReceived;

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
        return salary;
    }


    public void reciveSalary(int salary){
        salaryReceived+=salary;

        School.updateRevenueSpent(salary);
    }

    public int totalSalaryRecevied(){
        return salaryReceived;
    }


    @Override
    public String toString() {
        return "the name of the teacher is " + this.getName() + "\n" +
                "the total amount of salary received by the teacher is " + this.salaryReceived;
    }
}
