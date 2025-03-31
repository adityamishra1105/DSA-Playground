// Program to print a pyramid using numbers


package Patterns;

import java.util.Scanner;

public class PatternSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        printPattern(n);
        sc.close();

    }
    static void printPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(i + "");
            }
            System.out.println();
        }
    }
}
