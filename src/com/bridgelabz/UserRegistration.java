package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {

    // Validate first name
    public static boolean validateFirstName(String firstName) {
        return firstName.matches("^[A-Z][a-z]{2,}$");
    }
    // Validate last name
    public static boolean validateLastName(String lastName) {
        return lastName.matches("^[A-Z][a-z]{2,}$");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //          First Name
        System.out.print("Enter The First Name : ");
        String firstName = scanner.nextLine();
        //Checking for valid first name
        if (!validateFirstName(firstName)) {
            System.out.println("Invalid First Name");
        } else {
            System.out.println("First Name " + firstName);
        }
        //          Last Name
        System.out.print("Enter The Last Name : ");
        String lastName = scanner.nextLine();
        //Checking for valid last name
        if (!validateLastName(lastName)) {
            System.out.println("Invalid Last Name");
        } else {
            System.out.println("Last Name " + lastName);
        }
    }
}
