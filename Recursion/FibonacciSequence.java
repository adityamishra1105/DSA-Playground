package Recursion;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to find Fibonacci Sequence till: ");
        int n = sc.nextInt();

        printSeq(n);

        sc.close();

    }

    static int FiboSeq(int n){
        if (n == 1 || n == 0) {
            return n;
        }
        return FiboSeq(n - 1) + FiboSeq(n - 2);
    }

    static void printSeq(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(FiboSeq(i) + " ");
        }
        System.out.println();
    }
}
