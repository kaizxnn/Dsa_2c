/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gabun_program;
import java.util.Scanner;

/**
 *
 * @author CL2-PC
 */
public class Gabun_program {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
        System.out.println("Hello World!");
        
        System.out.println("Renz Gabun");
        
        System.out.println("ACT2C_PROGRAM");
        
        System.out.println("Enter a number:");
        
        int x = input.nextInt();
        
        System.out.println("Enter a number:");
        
        int y = input.nextInt();
        
        int sum,diff,prod,quo ;
        
    sum = x + y;
    diff = x - y;
    prod = x * y;
    quo = x / y;

    System.out.println("Sum : " + sum);
    System.out.println("Difference : " + diff);
    System.out.println("Product : " + prod);
    System.out.println("Quotient : " + quo);
        
    }
}
