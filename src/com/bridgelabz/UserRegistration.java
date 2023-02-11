package com.bridgelabz;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserRegistration {

    static Scanner scanner = new Scanner(System.in);

    // Predicate to validate first name
    static Predicate<String> validateFirstName = firstName -> firstName.matches("^[A-Z][a-z]{2,}$");
    // Predicate to validate last name
    static Predicate<String> validateLastName = lastName -> lastName.matches("^[A-Z][a-z]{2,}$");
    // Predicate to validate user email
    static Predicate<String> validateUserEmail = userEmail -> userEmail.matches("^[a-z]{3,}[-_+.a-z0-9]*[@][0-1a-z]+[.][a-z]{2,}[.]?[,a-z]{0,3}$");
    // Predicate to validate user phone number
    static Predicate<String> validatePhoneNumber = phoneNumber -> phoneNumber.matches("^[+](91)[\\s][0-9]{10}$");
    // Predicate to validate user password
    static Predicate<String> validateUserPassword = userPassword -> userPassword.matches("^[A-Z][a-z]{7,}[0-9]+[@#$%&]$");


    public static void main(String[] args) {
        // First Name
        System.out.print("Enter The First Name : ");
        String firstName = scanner.nextLine();
        if (!validateFirstName.test(firstName)) {
            System.out.println("Invalid First Name");
        } else {
            System.out.println("First Name: " + firstName);
        }
        // Last Name
        System.out.print("Enter The Last Name : ");
        String lastName = scanner.nextLine();
        if (!validateLastName.test(lastName)) {
            System.out.println("Invalid Last Name");
        } else {
            System.out.println("Last Name: " + lastName);
        }
        //User Email
        System.out.print("Enter The User Email : ");
        String userEmail = scanner.nextLine();
        if (!validateUserEmail.test(userEmail)) {
            System.out.println("Invalid User Email");
        } else {
            System.out.println("User Email: " + userEmail);
        }

        // User Phone Number
        System.out.print("Enter The User Phone Number : ");
        String phoneNumber = scanner.nextLine();
        if (!validatePhoneNumber.test(phoneNumber)) {
            System.out.println("Invalid User Phone Number");
        } else {
            System.out.println("User Phone Number: " + phoneNumber);
        }

        // User Password
        System.out.print("Enter The User Password : ");
        String userPassword = scanner.nextLine();
        if (!validateUserPassword.test(userPassword)) {
            System.out.println("Invalid Password");
        } else {
            System.out.println("User Password : *************");
        }

    }
}
