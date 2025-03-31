package Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements inside the Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
    }

    static int sortInsertion(int[] arr){
        if (arr.length == 0) {
            return 0;
        }
        boolean swapped;
        int first = 0;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            if (arr[i] > arr[i + 1]) {
                arr[i] = first;
                first = arr[i + 1];
                arr[i + 1] = arr[i];
                swapped = true;
            }
        }
        if (!swapped) {
            break;
        } 
    }
}
