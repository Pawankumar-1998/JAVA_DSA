package com.Projects.SchoolManagment;

import java.util.List;

/**
 * this class is responsible for describing the school class
 */

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalRevenue;
    private static int revenueSpent;

    /**
     * as soon as the object of the teacher is created
     * @param teachers will be passed as argument describing the number of teacher in the school
     * @param students will be passed as argument describing the number of students in the school
     *                 total revenue and revenueSpent will be zero as it is created just now
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalRevenue = 0;
        this.revenueSpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students ;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalRevenue() {
        return totalRevenue;
    }

    public static void updateTotalRevenue(int Revenue) {
        totalRevenue += Revenue;
    }

    public static int getRevenueSpent() {
        return revenueSpent;
    }

    public void updateRevenueSpent(int revenueSpend) {
        totalRevenue -= revenueSpend;
    }
}
