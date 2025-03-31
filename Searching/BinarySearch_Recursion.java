package Searching;

import java.util.Scanner;

public class BinarySearch_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements inside the Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element you want to search for: ");
        int target = sc.nextInt();
        int result = recursionBinary(arr, 0, n - 1, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }

    static int recursionBinary(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            return recursionBinary(arr, start, mid - 1, target);
        }

        return recursionBinary(arr, mid + 1, end, target);
    }
}
