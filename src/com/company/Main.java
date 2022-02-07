package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin operation = new Admin();

        int check = 0;
        while (check != 7) {
            int action = 0;
            do {
                try {
                    System.out.print("\n1. Create Department\n2. Add Student\n3. View list of departments\n" +
                            "4. Remove department\n5. View list of students\n6. Remove student\n7. Exit" +
                            "\nWhat action will you like to perform: ");
                    action = input.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("Invalid input!");
                }
                input.nextLine();
            } while (action == 0);
            check = action;

            switch (action) {
                case 1:
                    operation.createDepartment();
                    break;
                case 2:
                    operation.addStudent();
                    break;
                case 3:
                    operation. viewDepartmentList();
                    break;
                case 4:
                    operation.removeDepartment();
                    break;
                case 5:
                    operation.viewStudentList();
                    break;
                case 6:
                    operation.removeStudent();
                    break;
                case 7:
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("\nInvalid number entered!");
            }
        }
    }
}
