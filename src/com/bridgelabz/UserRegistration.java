package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {

    // validate first name
    public static boolean validateFirstName(String firstName) {
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The First Name : ");
        String firstName = scanner.nextLine();

        if (!validateFirstName(firstName)) {
            System.out.println("Invalid First Name");
        } else {
            System.out.println("First Name : " + firstName);
        }

    }
}
