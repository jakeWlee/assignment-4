package com.example.gradesubmission;

public class Grade {
    private String name;
    private String firstName;
    private String lastName;
    private String subject;
    private String score;
    private String grade;

    public Grade(String name, String subject, String score) {
        this.name = name;
        this.firstName = name;
        this.subject = subject;
        this.score = score;
    }

    public Grade(String firstName, String lastName, String subject, String score, String grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = firstName + " " + lastName;
        this.subject = subject;
        this.score = score;
        this.grade = grade;
    }

    public Grade() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
