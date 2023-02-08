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
    // Validating User Email
    public static boolean validateUserEmail(String userEmail) {
        return userEmail.matches("^[abc]{3}[.a-z]*[@][bl]{2}[.co]{3}[.a-z]*$");
    }
    // Validate User Phone Number
    public static boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^[+](91)[\\s][0-9]{10}$");
    }
    // Validate User Password
    public static boolean validateUserPassword(String userPassword) {
        return userPassword.matches("^[a-z]{8,}$");
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//                  First Name
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
        //          User Email
        System.out.print("Enter The User Email : ");
        String userEmail = scanner.nextLine();
        //Checking for valid Email
        if (!validateUserEmail(userEmail)) {
            System.out.println("Invalid User Email");
        } else {
            System.out.println("User Email " + userEmail);
        }
        //          User Phone Number
        System.out.print("Enter The User Phone Number : ");
        String phoneNumber = scanner.nextLine();
        //Checking for valid Phone Number
        if (!validatePhoneNumber(phoneNumber)) {
            System.out.println("Invalid User Phone Number");
        } else {
            System.out.println(" User Phone Number " + phoneNumber);
        }
//                  User Password
        System.out.print("Enter The User Password : ");
        String userPassword = scanner.nextLine();
        //Checking for valid Phone Number
        if (!validateUserPassword(userPassword)) {
            System.out.println("Invalid User Password");
        } else {
            System.out.println("User Password " + userPassword);
        }
    }
}
