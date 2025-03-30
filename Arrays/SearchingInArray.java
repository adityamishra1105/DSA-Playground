// This program implements searching in an Two Dimensional Array

import java.util.Scanner;

public class SearchingInArray {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number of rows in the Array: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns in the Array: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Enter the elements inside the array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the element you want to search for: ");
        int target = sc.nextInt();

        System.out.print(findElement(arr, target));



        sc.close();
    }

    static String findElement(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return "Element found at position: (" + i + ", " + j + ") ";
                }
                
            }
        }
        return "Element not found";
    }
}