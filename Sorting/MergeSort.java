package Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements inside the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        sortMerge(arr, 0, arr.length - 1);
        
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }

    static void sortMerge(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            
            // Recursively sort the two halves
            sortMerge(arr, start, mid);
            sortMerge(arr, mid + 1, end);
            
            // Merge the sorted halves
            merge(arr, start, mid, end);
        }
    }

    static void merge(int[] arr, int start, int mid, int end) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - start + 1;
        int n2 = end - mid;
        
        // Temporary arrays
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        // Copy data to temp arrays left[] and right[]
        for (int i = 0; i < n1; i++) {
            left[i] = arr[start + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }
        
        // Merge the temp arrays back into arr[start..end]
        int i = 0, j = 0, k = start;
        
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of left[], if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of right[], if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
