import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Strickland
 */
public class Main {
    final static int legalDrivingAge = 16;
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("What is your age? ");
            System.out.println(
                    (scan.nextInt() >= legalDrivingAge) ?
                            "You are old enough to legally drive."
                            :
                            "You are not old enough to legally drive."
            );
        }
    }
}
