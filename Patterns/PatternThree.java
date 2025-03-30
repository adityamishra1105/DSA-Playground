// Program to print Inverted right angled triangle


package Patterns;

import java.util.Scanner;

public class PatternThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        printPattern(n);

        sc.close();
    }
    static void printPattern(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
