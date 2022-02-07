package com.company;

import java.util.Date;

public class Department {
    private static int idSource = 100;
    private int id;
    private String departmentName;
    private Date dateCreated;

    public Department(String departmentName) {
        this.id = idSource++;
        this.departmentName = departmentName;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "{Department id: " + id +
                " Department name: " + departmentName +
                " Date created: " + dateCreated + "}\n";
    }
}
