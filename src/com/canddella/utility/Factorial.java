package com.canddella.utility;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ch;
        do 
        {
        	 System.out.println("Enter the number");
             int n = scanner.nextInt();
             int factorial = 1; 

             for (int i = 1; i <= n; i++) {
                 factorial = factorial * i; 
             }

             System.out.println("Factorial of " + n + " is: " + factorial);
             System.out.println("Do you want to continue");
             scanner.nextLine();
             ch = scanner.nextLine().charAt(0);
           } while (ch == 'y'|| ch == 'Y');	
       
    }
}
