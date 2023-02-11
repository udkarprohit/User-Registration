package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {
    // Validate first name
    public static void validateFirstName(String firstName) throws InvalidDetailsException {
//        return firstName.matches("^[A-Z][a-z]{2,}$");
        if (!firstName.matches("^[A-Z][a-z]{2,}$")) {
            throw new InvalidDetailsException("Invalid first name");
        }
    }

    // Validate last name
    public static void validateLastName(String lastName) throws InvalidDetailsException {
//        return lastName.matches("^[A-Z][a-z]{2,}$");
        if (!lastName.matches("^[A-Z][a-z]{2,}$")) {
            throw new InvalidDetailsException("Invalid last name");
        }
    }

    // Validating User Email
    public static void validateUserEmail(String userEmail) throws InvalidDetailsException {
//        return userEmail.matches("^[a-z]{3,}[-_+.a-z0-9]*[@][0-1a-z]+[.][a-z]{2,}[.]?[,a-z]{0,3}$");
        if (!userEmail.matches("^[a-z]{3,}[-_+.a-z0-9]*[@][0-1a-z]+[.][a-z]{2,}[.]?[,a-z]{0,3}$")) {
            throw new InvalidDetailsException("Invalid email");
        }
    }

    // Validate User Phone Number
    public static void validatePhoneNumber(String phoneNumber) throws InvalidDetailsException {
//        return phoneNumber.matches("^[+](91)[\\s][0-9]{10}$");
        if (!phoneNumber.matches("^[+](91)[\\s][0-9]{10}$")) {
            throw new InvalidDetailsException("Invalid phone number");
        }
    }

    // Validate User Password
    public static void validateUserPassword(String userPassword) throws InvalidDetailsException {
//        return userPassword.matches("^[A-Z][a-z]{7,}[0-9]+[@#$%&]$");
        if (!userPassword.matches("^[A-Z][a-z]{7,}[0-9]+[@#$%&]$")) {
            throw new InvalidDetailsException("Invalid password");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//                  First Name
        try {
            System.out.print("Enter The First Name : ");
            String firstName = scanner.nextLine();
            //Checking for valid first name
            validateFirstName(firstName);
            System.out.println("First Name: " + firstName);
        } catch (InvalidDetailsException e) {
            System.out.println(e.getMessage());
        }
        try {
            //          Last Name
            System.out.print("Enter The Last Name : ");
            String lastName = scanner.nextLine();
            //Checking for valid last name
            validateLastName(lastName);
            System.out.println("Last Name : " + lastName);
        } catch (InvalidDetailsException e) {
            System.out.println(e.getMessage());
        }

            //          User Email
        try {
            System.out.print("Enter The User Email : ");
            String userEmail = scanner.nextLine();
            //Checking for valid Email
            validateUserEmail(userEmail);
            System.out.println("User Email " + userEmail);
        } catch (InvalidDetailsException e) {
            System.out.println(e.getMessage());
        }

            //          User Phone Number
        try {
            System.out.print("Enter The User Phone Number : ");
            String phoneNumber = scanner.nextLine();
            //Checking for valid Phone Number
            validatePhoneNumber(phoneNumber);
            System.out.println(" User Phone Number " + phoneNumber);
        } catch (InvalidDetailsException e) {
            System.out.println(e.getMessage());
        }
//                  User Password
        try {
            System.out.print("Enter The User Password : ");
            String userPassword = scanner.nextLine();
            //Checking for valid Phone Number
            validateUserPassword(userPassword);
            System.out.println("User Password " + userPassword);
        } catch (InvalidDetailsException e) {
            System.out.println(e.getMessage());
        }
    }
}
