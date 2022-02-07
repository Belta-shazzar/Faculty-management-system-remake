package com.company;

import java.util.Date;

public class Student {
    private static int idSource = 001;
    private int id;
    private String firstName;
    private String lastName;
    private String department;
    private Date dateAdded;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Student(String firstName, String lastName, String department) {
        this.id = idSource++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.dateAdded = new Date();
    }

    @Override
    public String toString() {
        return "{Id: " + id + ", First name: " + firstName + ", Last name: "
                + lastName + ", Department: " + department
                + ", Date created: " + dateAdded + "\n";
    }
}
