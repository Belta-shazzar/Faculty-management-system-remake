package com.company;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    static Scanner input = new Scanner(System.in);
    public void errorMsg() {
        System.out.println("Invalid input!");
    }
    public int testMethods() {
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

    public String firstNameGet() {
        System.out.print("Enter first name: ");
        String firstName = input.next();
        return firstName;
    }

    public String lastNameGet() {
        System.out.print("Enter first name: ");
        String lastName = input.next();
        return lastName;
    }


    public static void main(String[] args) {
        Test test = new Test();


        System.out.println("Picked number is: " + test.testMethods());


    }
}






























//    public static Method recursive(int i) {
//        if (i < 11) {
//            System.out.println("Running fot the " + i + "th time");
//            return recursive(i + 1);
//        }else return null;
//    }
