package org.example;

public class Course {
    private final String subject;
    private final int credit;
    private final String grade;

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public int getCredit() {
        return this.credit;
    }

    public double getGPAToNumber() {
        double gpa = 0;
        switch (this.grade) {
            case "A":
                gpa = 4.0;
                break;
            case "A-":
                gpa = 3.67;
                break;
            case "B+":
                gpa = 3.33;
                break;
            case "B":
                gpa = 3.0;
                break;
            case "B-":
                gpa = 2.67;
                break;
            case "C+":
                gpa = 2.33;
                break;
        }
        return gpa;
    }

    public double multiplyCreditAndCourseGPA() {
        return credit * this.getGPAToNumber();
    }
}
