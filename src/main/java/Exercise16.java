/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 *
 */

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        double age;

        Scanner scan = new Scanner(System.in); //Double scanner.
        System.out.print("What is your age? ");
        age = scan.nextDouble();

        double legal_age = 16;

        String result = (age > legal_age) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(result);

    }
}
