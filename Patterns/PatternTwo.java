// Program to print a right angle triangle


package Patterns;

import java.util.Scanner;

public class PatternTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        printPattern(n);

        sc.close();
        
    }

    static void printPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}