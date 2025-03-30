// Program to draw a square using stars


package Patterns;

import java.util.Scanner;

public class PatternOne{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();

        printPattern(n, m);


        sc.close();
    }
    static void printPattern(int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}