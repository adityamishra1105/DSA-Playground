package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to find factorial for: ");
        int n = sc.nextInt();

        printFact(n);
        sc.close();
    }
    static int factNum(int n){
        if (n <= 1) {
            return n;
        }
        return n * factNum(n - 1);
    }

    static void printFact(int n){
        System.out.println("The factorial of the number " + n + " is: " + factNum(n));
    }
    
}