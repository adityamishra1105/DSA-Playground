package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // Using StringBuilder to reverse the string
        String reversed = new StringBuilder(str).reverse().toString();
        
        System.out.println("Reversed String: " + reversed);
        sc.close();
    }
}
