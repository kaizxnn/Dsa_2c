package com.mycompany.gabun_program;

import java.util.Scanner;

public class Rps {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter (1) Rock, (2) Paper, (3) Scissors");

        System.out.print("Enter Player 1: ");
        int p1 = scan.nextInt();

        System.out.print("Enter Player 2: ");
        int p2 = scan.nextInt();

        if (p1 == 1 && p2 == 1) {
            System.out.println("Draw");
        }
        else if (p1 == 1 && p2 == 2) {
            System.out.println("Player 2 wins");
        }
        else if (p1 == 1 && p2 == 3) {
            System.out.println("Player 1 wins");
        }
        else if (p1 == 2 && p2 == 1) {
            System.out.println("Player 1 wins");
        }
        else if (p1 == 2 && p2 == 2) {
            System.out.println("Draw");
        }
        else if (p1 == 2 && p2 == 3) {
            System.out.println("Player 2 wins");
        }
        else if (p1 == 3 && p2 == 1) {
            System.out.println("Player 2 wins");
        }
        else if (p1 == 3 && p2 == 2) {
            System.out.println("Player 1 wins");
        }
        else if (p1 == 3 && p2 == 3) {
            System.out.println("Draw");
        }
        else {
            System.out.println("Invalid input. Enter only 1, 2, or 3.");
        }

      
    }
}