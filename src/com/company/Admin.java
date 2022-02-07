package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Admin {
    Scanner input = new Scanner(System.in);
    ArrayList<Department> departmentArrayList = new ArrayList<>();
    ArrayList<Student> studentArrayList = new ArrayList<>();

    Student student;
    Department department;

    public void errorMsg() {
        System.out.println("Invalid input!");
    }

//    Global try catch method
    public int testMethod() {
        int value = 0;
        do {
            try {
                System.out.print("Select: ");
                value = input.nextInt();
            } catch (InputMismatchException ex) {
                errorMsg();
            }
            input.nextLine();
        } while (value == 0);
        return value;
    }
//    git config --global user.name "Belta-shazzar"

//    git config --global user.email "oguejioforchinonso20@gmail.com"

//    Method for department creation
    public void createDepartment() {
        System.out.println("For number of departments to be created,");
        int action = testMethod();

        int i = 1;
        for (; i <= action; i++) {
            System.out.print("Enter name for department " + i + ": ");
            department = new Department(input.next());

            departmentArrayList.add(department);
        }
        System.out.println((i - 1) + " Department created");
    }

    public void viewDepartmentList() {
        if (departmentArrayList.isEmpty()) {
            System.out.println("No department created.");
        } else {
            System.out.println(departmentArrayList);
        }
    }

//    Remove department method.
    public void removeDepartment() {
        System.out.println("for number of departments to be removed, ");
        int action = testMethod();

        int count = 0;
        for (; count < action; count++) {
            viewDepartmentList();
            int idSelect;
            try {
                System.out.print("Select department id: ");
                idSelect = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Id does not exist");
                break;
            }

            Iterator<Department> iterator = departmentArrayList.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getId() == idSelect) {
                    iterator.remove();
                }
            }
        }
    }

// Start point for student adding
    public String deptSet() {
        String deptSelect = null;
            viewDepartmentList();
            System.out.println("Desired department by id.");

            do {
                int deptIdSelect = testMethod();
                for (Department department : departmentArrayList) {
                    if (department.getId() == deptIdSelect) {
                        deptSelect = department.getDepartmentName();
                    } else {
                        System.out.println("Entered id matches no department");
                    }
                }
            } while (deptSelect == null);

        return deptSelect;
    }

    public String firstNameGet() {
        System.out.print("Enter first name: ");
        String firstName = input.next();
        return firstName;
    }

    public String lastNameGet() {
        System.out.print("Enter last name: ");
        String lastName = input.next();
        return lastName;
    }

 // Add student method
    public void addStudent() {
        if (departmentArrayList.isEmpty()) {
            System.out.println("No available department. Create department first.");
        } else {
            int opsNumber = 0;
            int i = 0;
            for (; i < 2;) {
                try {
                    System.out.print("Number of student to be added: ");
                    opsNumber = input.nextInt();
                } catch (InputMismatchException ex) {
                    errorMsg();
                }
                input.nextLine();
                if (opsNumber > 0) {
                    break;
                } else i++;
            }
            if (opsNumber > 0) {
                for (int j = 0; j < opsNumber; j++) {
                    String studentDept = deptSet();
                    student = new Student(firstNameGet(), lastNameGet(), studentDept);
                    studentArrayList.add(student);
                }
            } else {
                System.out.println("Return to main menu.");
            }
            System.out.println(opsNumber + " student added.");
        }
    }  // Student add methods stop here.

    public void viewStudentList() {
        if (studentArrayList.isEmpty()) {
            System.out.println("No student added.");
        } else {
            System.out.println(studentArrayList);
        }
    }

//    Student remove method
    public void removeStudent() {
        System.out.println("for number of students to be removed, ");
        int action = testMethod();

        int count = 0;
        for (; count < action; count++) {
            viewStudentList();
            int idSelect;
            try {
                System.out.print("Select student id: ");
                idSelect = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Id does not exist");
                break;
            }

            Iterator<Student> iterator = studentArrayList.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getId() == idSelect) {
                    iterator.remove();
                }
            }
        }
    }
}